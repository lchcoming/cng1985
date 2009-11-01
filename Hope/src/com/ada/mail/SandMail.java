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

        // 获得属性，并生成Session对象 
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
        String content = "<font style=\"BACKGROUND-COLOR: #666699\" color=\"#ff0000\" size=\"5\">测试格式化内容测试<a href=\"\">格式化内容</a>测试格<em>式化</em>内容</font>";
        try{

            sendsession = Session.getInstance(props, null);
            //向属性中写入SMTP服务器的地址
            props.put("mail.smtp.host", "smtp.139.com");
            //设置SMTP服务器需要权限认证
            props.put("mail.smtp.auth", "true");
            //设置输出调试信息
            // sendsession.setDebug(true);
            //根据Session生成Message对象
            message = new MimeMessage(sendsession);
            //设置发信人地址
            message.setFrom(new InternetAddress(from));
            //设置收信人地址
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
            //设置e-mail标题 
            message.setSubject(title);
            //设置e-mail发送时间
            message.setSentDate(new Date());
            //设置e-mail内容
            message.setText(content);
            //建立第一部分：文本正文
            messageBodyPart.setContent(content, "text/html;charset=gbk");//给BodyPart对象设置内容和格式/编码方式    
            multipart.addBodyPart(messageBodyPart);
            if (!attachment.equals("")){
                // 建立第二部分：附件     
                messageBodyPart = new MimeBodyPart();
                // 获得附件
                DataSource source = new FileDataSource(attachment);
                //设置附件的数据处理器
                messageBodyPart.setDataHandler(new DataHandler(source));
                // 设置附件文件名
                messageBodyPart.setFileName(attachment);
                // 加入第二部分
                multipart.addBodyPart(messageBodyPart);
            }
            // 将多部分内容放到e-mail中
            message.setContent(multipart);

            //保存对于e-mail的修改
            message.saveChanges();
            //根据Session生成Transport对象
            transport = sendsession.getTransport("smtp");
            //连接到SMTP服务器
            transport.connect("smtp.139.com", "fengl", "fe103");
            //发送e-mail
            transport.sendMessage(message, message.getAllRecipients());
            //关闭Transport连接
            transport.close();
        } catch (MessagingException m){
            System.out.println(m.toString());
        } catch (Exception e){
            e.printStackTrace();
        } 
    }
    
    //获取收件人地址
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