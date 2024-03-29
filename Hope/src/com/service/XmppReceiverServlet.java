package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.xmpp.JID;
import com.google.appengine.api.xmpp.Message;
import com.google.appengine.api.xmpp.MessageBuilder;
import com.google.appengine.api.xmpp.MessageType;
import com.google.appengine.api.xmpp.Presence;
import com.google.appengine.api.xmpp.SendResponse;
import com.google.appengine.api.xmpp.XMPPService;
import com.google.appengine.api.xmpp.XMPPServiceFactory;

public class XmppReceiverServlet extends HttpServlet {

	 private XMPPService xmppService;

	  @Override
	  public void init() {
	    this.xmppService = XMPPServiceFactory.getXMPPService();
	  }

	  // For testing. Real requests are POST
	  public void doGet(HttpServletRequest req, HttpServletResponse res)
	      throws IOException {

	    Message message =new MessageBuilder()
	        .withMessageType(MessageType.CHAT)
	        .withFromJid(new JID(req.getParameter("from")))
	        .withRecipientJids(new JID(req.getParameter("to")))
	        .withBody(req.getParameter("body"))
	        .build();
	    processMessage(message, res);
	  }

	  public void doPost(HttpServletRequest req, HttpServletResponse res)
	      throws IOException {
	    processMessage(xmppService.parseMessage(req), res);
	  }

	  public void processMessage(Message message, HttpServletResponse res) throws IOException {
	    JID fromId = message.getFromJid();
	    Presence presence = xmppService.getPresence(fromId);
	    String presenceString = presence.isAvailable() ? "" : "not ";
	    String messages=message.getBody();
	    SendResponse response = xmppService.sendMessage(
	        new MessageBuilder().
	        withBody(message.getBody() + " (you are " + presenceString+messages + "available)").
	        withRecipientJids(fromId).
	        build());

	    for (Map.Entry<JID, SendResponse.Status> entry :
	        response.getStatusMap().entrySet()) {
	      res.getWriter().println(entry.getKey() + "," + entry.getValue() + "<br>");
	    }

	    res.getWriter().println("processed");
	  }
}
