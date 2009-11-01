package com.ada.gtalk;

import com.google.appengine.api.xmpp.JID;
import com.google.appengine.api.xmpp.Message;
import com.google.appengine.api.xmpp.MessageBuilder;
import com.google.appengine.api.xmpp.SendResponse;
import com.google.appengine.api.xmpp.XMPPService;
import com.google.appengine.api.xmpp.XMPPServiceFactory;

public class Work {
public void sendmessage(){
	  JID jid = new JID("example@gmail.com");
      String msgBody = "Someone has sent you a gift on Example.com. To view: http://example.com/gifts/";
      Message msg = new MessageBuilder()
          .withRecipientJids(jid)
          .withBody(msgBody)
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
