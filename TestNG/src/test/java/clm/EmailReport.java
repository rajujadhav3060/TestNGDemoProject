package clm;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailReport {

	 public static void main( String[] args )
	 {
	 // Put recipient’s address
	 String to = "rajendrabjadhav3060@gmail.com";
	 // Put sender’s address
	 String from = "rajendraaloha222@gmail.com";
	 final String username = "rajendraaloha222@gmail.com";//username generated by Pepipost
	 final String password = "Raju@2711";//password generated by Pepipost
	 // Paste host address from the SMTP relay tab in Integrations from your Pepipost App ijtrysqeyvwxxkxx
	 String host = "smtp.gmail.com";
	 Properties props = new Properties();
	 props.put("mail.smtp.auth", "true");
	 //props.put("mail.smtp.starttls.enable", "true");
	 props.put("mail.smtp.host", host);
	 props.put("mail.smtp.port", "465");
	 // Get the Session object.
	 Session session = Session.getInstance(props,
	 new javax.mail.Authenticator() {
	 protected PasswordAuthentication getPasswordAuthentication() {
	 return new PasswordAuthentication(username, password);
	 }
	 });
	 session.setDebug(true);
	 try {
	 // Create a default MimeMessage object.
	 Message message = new MimeMessage(session);
	 // Set From: header field
	 message.setFrom(new InternetAddress(from));
	 // Set To: header field
	 message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
	 // Set Subject: header field
	 message.setSubject("My first message with JavaMail");
	 // Put the content of your message
	 message.setText("Hi there, this is my first message sent with JavaMail");
	 // Send message
	 System.out.println("Sending msg");
	 
	 Transport.send(message);
	 
	 System.out.println("Sent message successfully....");
	 
	 } catch (MessagingException e) {
	 throw new RuntimeException(e);
	 }
	 }
}
