package com.ada.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Map.Entry;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangdaiping@vip.qq.com
 * @version 1.3 (10/3/2010)
 */
public class TreeGridEditorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static int count = 0;

    private Map<String, City> citys = new LinkedHashMap<String, City>();

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        citys.put("1", new City("1", "0", "北京", "60000", "0", "2008-11-07", false, false, false));
        citys.put("11", new City("11", "1", "市区", "43000", "1", "2008-11-07", false, false, false));
        citys.put("111", new City("111", "11", "东城区", "13000", "1", "2008-11-07", false, true, false));
        citys.put("112", new City("112", "11", "西城区", "10000", "1", "2008-11-21", false, true, false));
        citys.put("113", new City("113", "11", "朝阳区", "10000", "1", "2008-12-05", false, true, false));
        citys.put("114", new City("114", "11", "海淀区", "10000", "1", "2008-12-17", false, true, false));
        citys.put("12", new City("12", "1", "郊区", "17000", "0", "2009-01-27", false, false, false));
        citys.put("121", new City("121", "12", "昌平区", "9000", "1", "2009-01-27", false, true, false));
        citys.put("122", new City("122", "12", "大兴区", "8000", "0", "2009-01-28", false, true));
        citys.put("2", new City("2", "0", "上海", "40000", "1", "2008-11-15", false, false, false));
        citys.put("21", new City("21", "2", "市区", "40000", "1", "2008-11-15", false, false));
        citys.put("211", new City("211", "21", "黄浦区", "20000", "1", "2008-11-15", false, true, false));
        citys.put("212", new City("212", "21", "徐汇区", "20000", "1", "2008-11-27", false, true, false));
    }

    public TreeGridEditorServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String m = request.getParameter("method");
        if (m.equalsIgnoreCase("load")) {
            doLoad(request, response);
        } else {
            doEdit(request, response);
        }
    }

    private void doLoad(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("node");
        if (id == null || id.length() == 0 || id.equals("tge-root")) {
            id = "0";
        }
        List<City> cts = getChilds(id);
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String output = "[";
        for (City ct : cts) {
            if (output.length() > 1) {
                output += ",";
            }
            output += ct.toJsonString();
        }
        out.println(output + "]");
    }

    private List<City> getChilds(String pid) {
        List<City> cts = new ArrayList<City>();
        for (Iterator<Entry<String, City>> it = citys.entrySet().iterator(); it.hasNext();) {
            City ct = it.next().getValue();
            if (ct.pid.equals(pid)) {
                cts.add(ct);
            }
        }
        return cts;
    }

    @SuppressWarnings("unused")
    private void doEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String m = request.getParameter("method");
        String id = request.getParameter("id");
        String pid = request.getParameter("nodeParentId");
        String path = request.getParameter("nodePath");
        String parentPath = request.getParameter("nodeParentPath");
        String checked = request.getParameter("nodeChecked");
        String city = request.getParameter("city");
        String popu = request.getParameter("popu");
        String overlapped = request.getParameter("overlapped");
        String created = request.getParameter("created");

        City c = null;
        if (m.equalsIgnoreCase("add")) {
            count++;
            id = "n" + String.valueOf(count);
            c = new City(id, (pid.equals("tge-root") ? "0" : pid), city, popu, overlapped, created, false, true, Boolean.valueOf(checked));
        } else if (m.equalsIgnoreCase("update") || m.equalsIgnoreCase("delete")) {
            c = citys.get(id);
        }

        if (c == null) {
            return;
        }

        if (m.equalsIgnoreCase("add")) {
            citys.put(id, c);
            City pc = citys.get(pid);
            if (pc != null) {
                pc.setLeaf(false);
            }
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.print(c.id);
        } else if (m.equalsIgnoreCase("update")) {
            c.update(id, city, popu, overlapped, created, Boolean.valueOf(checked));
        } else if (m.equalsIgnoreCase("delete")) {
            City pc = citys.get(c.pid);
            citys.remove(id);
            if (pc != null) {
                List<City> cts = getChilds(pc.id);
                if (cts.size() == 0) {
                    pc.setLeaf(true);
                }
            }
        }

        System.out.println("Method:" + m + " - " + c.toString());
    }

    public class City {
        private String id;
        private String pid;
        private String name;
        private String popu;
        private String overlapped;
        private String created;
        private boolean expanded = false;
        private boolean leaf = false;
        private Boolean checked;

        public City(String id, String pid, String name, String popu, String overlapped, String created, boolean expanded, boolean leaf) {
            this.id = id;
            this.pid = pid;
            this.name = name;
            this.popu = popu;
            this.overlapped = overlapped;
            this.created = created;
            this.expanded = expanded;
            this.leaf = leaf;
        }

        public City(String id, String pid, String name, String popu, String overlapped, String created, boolean expanded, boolean leaf, boolean checked) {
            this(id, pid, name, popu, overlapped, created, expanded, leaf);
            this.checked = checked;
        }

        public void update(String id, String name, String popu, String overlapped, String created, Boolean checked) {
            this.id = id;
            this.name = name;
            this.popu = popu;
            this.overlapped = overlapped;
            this.created = created;
            this.checked = checked;
        }

        public void setLeaf(boolean leaf) {
            this.leaf = leaf;
        }

        public void setChecked(Boolean checked) {
            this.checked = checked;
        }

        @Override
        public String toString() {
            return "id:'" + this.id + "',city:'" + this.name + "',popu:'" + this.popu + "',overlapped:'" + this.overlapped + "',created:'" + this.created + "'";
        };

        public String toJsonString() {
            return "{id:'" + this.id + "',city:'" + this.name.replace("'", "\\'") + "',popu:'" + this.popu + "',overlapped:'" + this.overlapped + "',created:'" + this.created + "',expanded:" + this.expanded + ",leaf:" + this.leaf + (this.checked != null ? ",checked:" + this.checked : "") + "}";
        };
    }
}
