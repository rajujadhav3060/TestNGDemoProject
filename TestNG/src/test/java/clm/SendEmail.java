package clm;

import java.util.*; 
import javax.mail.*; 
import javax.mail.internet.*; 
import javax.activation.*; 

public class SendEmail { 
	
	public static void main(String[] args) 
	{ 
		// change below lines accordingly 
		String to = "vishalmurkute@alohatechnologydev.com"; 
		String from = "rajendraj@alohatechnologydev.com"; 
		String host = "192.168.70.231";             // or IP address 

		// Get the session object 
		// Get system properties 
		
		Properties properties = System.getProperties(); 

		// Setup mail server 
		properties.setProperty("smtp.mail.yahoo.com", host); 

		// Get the default Session object 
		Session session = Session.getDefaultInstance(properties); 

		// compose the message 
		try { 

			// javax.mail.internet.MimeMessage class 
			// is mostly used for abstraction. 
			MimeMessage message = new MimeMessage(session); 

			// header field of the header. 
			message.setFrom(new InternetAddress(from)); 
			
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to)); 
			
			message.setSubject("subject"); 
			
			message.setText("Hello, I am rajendra sending email from selenium "); 
		
			System.out.println("Sending email is pending");
			
			// Send message 
			Transport.send(message); 
			
			System.out.println("Send email successfully"); 
		} 
		catch (MessagingException mex) { 
			mex.printStackTrace(); 
		} 
	} 
} 