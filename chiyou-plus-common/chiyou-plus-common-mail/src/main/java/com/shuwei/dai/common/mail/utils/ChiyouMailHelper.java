package com.shuwei.dai.common.mail.utils;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

public class ChiyouMailHelper {
    /**
     * 发送邮件工具类
     *
     * @param myEmailAccount     发件人邮箱地址
     * @param myEmailPassword    发件人邮箱密码
     * @param senderPersonalName 发件人昵称
     * @param receiveMailAccount 收件人邮箱数组
     * @param subject            邮件主题
     * @param text               邮件内容
     */
    public static void sendMail(String myEmailAccount,
                                String myEmailPassword,
                                String senderPersonalName,
                                String receiveMailAccount,
                                String subject,
                                String text) throws UnsupportedEncodingException, MessagingException {
        String myEmailSMTPHost = "smtp.qq.com"; // 发件人邮箱服务器协议
        String mailTransportProtocol = "smtp"; // 使用的协议（JavaMail规范要求）
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", mailTransportProtocol);
        props.setProperty("mail.smtp.host", myEmailSMTPHost);   // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.auth", "true");            // 需要请求认证
        Session session = Session.getInstance(props);
        session.setDebug(false);
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(myEmailAccount, senderPersonalName, "UTF-8"));
        Address[] internetAddressTo = InternetAddress.parse(receiveMailAccount);
        message.setRecipients(MimeMessage.RecipientType.TO, internetAddressTo);
        message.setSubject(subject, "UTF-8");
        message.setContent(text, "text/html;charset=UTF-8");
        message.setSentDate(new Date());
        message.saveChanges();
        Transport transport = session.getTransport();
        transport.connect(myEmailAccount, myEmailPassword);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
}
