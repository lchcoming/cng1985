/** 
 * CopyRright (c)1985-2009: <br />                             
 * Project: AdventureWorks<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.xml<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-10<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-10          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlTest {

	/**
	 * @param args
	 * @throws IOException
	 * @throws SAXException
	 */
	public static void main(String[] args) throws SAXException, IOException {
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			File file = new File("E:\\OpenSource\\hibernate\\trunk\\pom.xml");
			
			Document doc = builder.parse(file);
			Element e = doc.getDocumentElement();
			System.out.println(e.getNodeName());
			System.out.println(e.getNodeValue());
			NodeList list = e.getChildNodes();
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				printnode(node);
				node.getChildNodes();
				
			}

			System.out.println(list.getLength());

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void printnode(Node node) {
		NodeList nodeList = node.getChildNodes();
		printnodeinfo(node);
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node nod = nodeList.item(i);
			printnodeinfo(nod);
			System.out.println(nod.getNodeName());
			System.out.println(nod.getNodeValue());
		}

	}

	private static void printnodeinfo(Node node) {
		print("节点名         " + node.getNodeName());
		print("节点值   " + node.getNodeValue());
		print("LocalName   " + node.getLocalName());
		NamedNodeMap map = node.getAttributes();
		if (map!=null) {
			print(""+map.getLength());
		}
		
		
	}

	private static void print(String source) {
		System.out.println(source);
	}

}
