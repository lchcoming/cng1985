/** 
* CopyRright (c)1985-2009: <br />                             
* Project: AdventureWorks<br />                                           
* Module ID:    <br />   
* Comments:            <br />                                  
* JDK version used:<JDK1.6><br />                                 
* Namespace:com.ada.xml<br />                             
* Author：ada.young <br />                  
* Create Date：  2009-10-12<br />   
* Modified By：ada.young          <br />                                
* Modified Date:2009-10-12          <br />                               
* Why & What is modified <br />   
* Version: 1.01         <br />       
*/ 
package com.ada.common.xml;


public class RssItem {
private String title;
private String link;
private String description;
private String category;
private String author;
private String pubDate;
private String comments;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getLink() {
	return link;
}
public void setLink(String link) {
	this.link = link;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPubDate() {
	return pubDate;
}
public void setPubDate(String pubDate) {
	this.pubDate = pubDate;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
}
