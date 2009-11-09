package com.ada.mail;

import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SandMail{

    @SuppressWarnings("static-access")
 public void SendMail2(String title, String attachment){

        // ������ԣ�������Session���� 
        Properties props = new Properties();
        Session sendsession;
        Transport transport;
        MimeMessage message = null;
        BodyPart messageBodyPart = new MimeBodyPart();
        Multipart multipart = new MimeMultipart();
        String from = "fengl@139.com";
        String to[]={"fengl@163.com"};
        String cc[] = {"281@qq.com"};
        String bcc[] = {"281@qq.com"};
        String content = "<font style=\"BACKGROUND-COLOR: #666699\" color=\"#ff0000\" size=\"5\">���Ը�ʽ�����ݲ���<a href=\"\">��ʽ������</a>���Ը�<em>ʽ��</em>����</font>";
        try{

            sendsession = Session.getInstance(props, null);
            //��������д��SMTP�������ĵ�ַ
            props.put("mail.smtp.host", "smtp.139.com");
            //����SMTP��������ҪȨ����֤
            props.put("mail.smtp.auth", "true");
            //�������������Ϣ
            // sendsession.setDebug(true);
            //����Session����Message����
            message = new MimeMessage(sendsession);
            //���÷����˵�ַ
            message.setFrom(new InternetAddress(from));
            //���������˵�ַ
            String toList = getMailList(to);
            InternetAddress[] iaToList = new InternetAddress().parse(toList);
            message.setRecipients(Message.RecipientType.TO,iaToList);
            if (cc != null){
                String ccList = this.getMailList(cc);
                    InternetAddress[] iaCCList = new InternetAddress().parse(ccList);
                message.setRecipients(Message.RecipientType.CC,iaCCList);
                 }
            if (bcc != null){
                String bccList = this.getMailList(bcc);
                    InternetAddress[] iaBCCList = new InternetAddress().parse(bccList);
                message.setRecipients(Message.RecipientType.BCC,iaBCCList);
                 }
            //����e-mail���� 
            message.setSubject(title);
            //����e-mail����ʱ��
            message.setSentDate(new Date());
            //����e-mail����
            message.setText(content);
            //������һ���֣��ı�����
            messageBodyPart.setContent(content, "text/html;charset=gbk");//��BodyPart�����������ݺ͸�ʽ/���뷽ʽ    
            multipart.addBodyPart(messageBodyPart);
            if (!attachment.equals("")){
                // �����ڶ����֣�����     
                messageBodyPart = new MimeBodyPart();
                // ��ø���
                DataSource source = new FileDataSource(attachment);
                //���ø��������ݴ�����
                messageBodyPart.setDataHandler(new DataHandler(source));
                // ���ø����ļ���
                messageBodyPart.setFileName(attachment);
                // ����ڶ�����
                multipart.addBodyPart(messageBodyPart);
            }
            // ���ಿ�����ݷŵ�e-mail��
            message.setContent(multipart);

            //�������e-mail���޸�
            message.saveChanges();
            //����Session����Transport����
            transport = sendsession.getTransport("smtp");
            //���ӵ�SMTP������
            transport.connect("smtp.139.com", "fengl", "fe103");
            //����e-mail
            transport.sendMessage(message, message.getAllRecipients());
            //�ر�Transport����
            transport.close();
        } catch (MessagingException m){
            System.out.println(m.toString());
        } catch (Exception e){
            e.printStackTrace();
        } 
    }
    
    //��ȡ�ռ��˵�ַ
    public String getMailList(String[] mailArray){
         
        StringBuffer toList = new StringBuffer();
    int length = mailArray.length;
        if(mailArray!=null && length <2){
             toList.append(mailArray[0]);
        }else{
             for(int i=0;i<length;i++){
                     toList.append(mailArray[i]);
                     if(i!=(length-1)){
                         toList.append(",");
                     }
             }
         }
     return toList.toString();
    }

    public static void main(String args[]){
     SandMail m = new SandMail();
        m.SendMail2("fenglingcompany", "D:\\tts.txt");
        m.SendMail2("fenglingcompany", "");
    }
}