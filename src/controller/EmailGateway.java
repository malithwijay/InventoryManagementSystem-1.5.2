/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author navod
 */
public class EmailGateway {
    public String sendOnlyMessage(String reciever,String subject,String content)
    {
        String result ="0";
        String to=reciever;
        String from="helpcenter.kingscar@gmail.com";
        String password="kingscar234";
        
        Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password);  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(subject);    
           message.setContent(content,"text/html");
           //send message  
           Transport.send(message);
           result="done";
          } catch (MessagingException e) {result=e+" Email Cannot send right now\n*Check your network\n*Check Email Address you entered";}    
             
        
        return result;
    }
}
