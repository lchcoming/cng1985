<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.world.model.*" %>
<%@page import="com.ada.daoimpl.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

CountryDaoImpl dao=new CountryDaoImpl();
Country con=new Country();
Provice pp=new Provice();
//pp.setCountry(con);
City c=new City();
//c.setProvice(pp);
c.setName("重庆");
pp.getCitys().add(c);
pp.getCitys().add(new City());
pp.getCitys().add(new City());
pp.getCitys().add(new City());
pp.getCitys().add(new City());
con.getProvices().add(pp);

dao.addCountry(con);
ProviceDaoImpl dd=new ProviceDaoImpl();
List<Provice> ps=dd.all();
for(Provice item:ps){
out.println("<br />");
out.println("省名"+item.getName());
//out.println(item.getCountry().getName());
out.println(item.getKey().getParent().getName());
out.println(item.getKey().getId());
List<City> css=item.getCitys();
out.println("<br />");
for(City ccc:css){
out.print("+++++++++");
out.print(ccc.getKey().getId());
out.print(ccc.getKey().getParent().getId());
out.println(ccc.getName());
}
//out.println(css.size());
//out.println("|||");

//out.println(item.getKey().getParent().getId());
//out.println(css.get(0).getProvice().getName());
//out.println(item.getCitys().get(0).getKey().getId());
}
 %>
</body>
</html>