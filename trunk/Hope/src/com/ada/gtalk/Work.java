package com.ada.gtalk;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.appengine.api.xmpp.JID;
import com.google.appengine.api.xmpp.Message;
import com.google.appengine.api.xmpp.MessageBuilder;
import com.google.appengine.api.xmpp.SendResponse;
import com.google.appengine.api.xmpp.XMPPService;
import com.google.appengine.api.xmpp.XMPPServiceFactory;

public class Work {
	public void sendmessage() {
		JID jid = new JID("cng1985@gmail.com");
		String msgBody = "系统出现异常  异常发生时间";
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		msgBody += dateFormat.format(now);
		msgBody += "请及时查看";
		Message msg = new MessageBuilder().withRecipientJids(jid).withBody(
				msgBody).build();

		boolean messageSent = false;
		XMPPService xmpp = XMPPServiceFactory.getXMPPService();
		if (xmpp.getPresence(jid).isAvailable()) {
			SendResponse status = xmpp.sendMessage(msg);
			messageSent = (status.getStatusMap().get(jid) == SendResponse.Status.SUCCESS);
		}

		if (!messageSent) {
			// Send an email message instead...
		}
	}
	public void sendmessage(String message){
		  JID jid = new JID("cng1985@gmail.com");

	      Message msg = new MessageBuilder()
	          .withRecipientJids(jid)
	          .withBody(message)
	          .build();
	              
	      boolean messageSent = false;
	      XMPPService xmpp = XMPPServiceFactory.getXMPPService();
	      if (xmpp.getPresence(jid).isAvailable()) {
	          SendResponse status = xmpp.sendMessage(msg);
	          messageSent = (status.getStatusMap().get(jid) == SendResponse.Status.SUCCESS);
	      }

	      if (!messageSent) {
	          // Send an email message instead...
	      }
	}
	public void sendmessage(String gtak,String message){
		  JID jid = new JID(gtak);

	      Message msg = new MessageBuilder()
	          .withRecipientJids(jid)
	          .withBody(message)
	          .build();
	              
	      boolean messageSent = false;
	      XMPPService xmpp = XMPPServiceFactory.getXMPPService();
	      if (xmpp.getPresence(jid).isAvailable()) {
	          SendResponse status = xmpp.sendMessage(msg);
	          messageSent = (status.getStatusMap().get(jid) == SendResponse.Status.SUCCESS);
	      }

	      if (!messageSent) {
	          // Send an email message instead...
	      }
	}
}
