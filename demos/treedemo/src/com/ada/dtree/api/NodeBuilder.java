/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dtree.api;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Mar 31, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Mar 31, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dtree.api;

import java.util.ArrayList;
import java.util.List;

import com.ada.dtree.core.TreeNode;
import com.ada.dtree.demo.NavigateDao;
import com.ada.dwr.Navigate;

/**
 * 接口介绍<br/> 返回一个List<TreeNode>注意子父关系 例如 <br/>
 * 
 * 
 * public class DemoMakerBuilder implements NodeBuilder{<br/> public List<TreeNode>
 * nodes() {<br/> NavigateDao dao=NavigateDao.getInstanece();<br/> List<Navigate>
 * list= dao.listall();<br/> List<TreeNode> nodes=new ArrayList<TreeNode>();<br/>
 * for(Navigate item:list){<br/> TreeNode node=new TreeNode();<br/>
 * node.setId(item.getId());<br/> node.setPid(item.getParentId());<br/>
 * node.setName(item.getTitle());<br/> if(null!=item.getUrl()){<br/>
 * node.setUrl(item.getUrl());<br/> }<br/> else{<br/> node.setUrl("#");<br/> }<br/>
 * <br/> nodes.add(node);<br/> }<br/> return nodes;<br/> }<br/> }<br/>
 * <br/>
 * 
 * @see com.ada.demo.DemoMakerBuilder
 * @version 1.01
 * @author Administrator
 * 
 */
public interface NodeBuilder {
	List<TreeNode> nodes();
}
