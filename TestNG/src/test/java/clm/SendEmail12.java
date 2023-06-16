//package clm;
//
//import java.util.Properties;
//
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//
//public class SendEmail12 {
//
//	public static void main(String[] args) {
//		System.out.println("==============Start mail sending============");
//		String hostSmtpUser = "rajendraaloha222@gmail.com";
//		String host = "smtp.gmail.com";
//		String hostPort = "587";
//		String hostSmtpPassword = "Raju@3060";
//
//		Properties properties = System.getProperties();
//		properties.put("mail.imap.ssl.enable", "true");            // required for Gmail
//		properties.put("mail.imap.auth.mechanisms", "XOAUTH2");
//		properties.setProperty("mail.smtp.user", hostSmtpUser);
//		properties.setProperty("mail.smtp.host", host);
//		properties.setProperty("mail.smtp.starttls.enable", "true");
//		properties.setProperty("mail.smtp.port", hostPort);
//		properties.setProperty("mail.smtp.auth", "true");
//
//		Session oSession;
//		if (true == ToolsCommon.isEmpty(hostSmtpUser))
//		    oSession = Session.getInstance(properties);
//		else
//		    oSession = Session.getInstance(properties, new javax.mail.Authenticator()
//		    {
//		        protected PasswordAuthentication getPasswordAuthentication()
//		        {
//		        return new PasswordAuthentication("hostSmtpUser", "hostSmtpPassword");
//		        }
//		    });
//
//		// Compose the message  
//		try
//		{
//		    MimeMessage message = new MimeMessage(oSession);
//		    message.setFrom(new InternetAddress("rajendraaloha222@gmail.com"));
//		    message.addRecipient(Message.RecipientType.TO, new InternetAddress("rajendrabjadhav3060@gmail.com"));
//		    message.setSubject("Mail send by Selenium Webdriver");
//		    message.setText("Please do not reply this mail ,this mail is sysytem genrated");
//
//		    // Send message  
//		    Transport.send(message);
//		}
//
//		catch (MessagingException ex)
//		{
//		    // Log the error.
//				ToolsLog.logError(TypeLog.ui, ex);
//		}
//
//	}
//
//}
