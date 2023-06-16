package clm;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendApp {
	public static void send(String smtpHost, int smtpPort, String from, String to, String subject, String content)
			throws AddressException, MessagingException {
// Create a mail session
		java.util.Properties props = new java.util.Properties();
		props.put("mail.smtp.host", smtpHost);
		props.put("mail.smtp.port", " " + smtpPort);
		Session session = Session.getDefaultInstance(props, null);

// Construct the message
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(from));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
		msg.setSubject(subject);
		msg.setText(content);
		System.out.println("Sending email is pending");
// Send the message
		Transport.send(msg);
		
		System.out.println("Email Send Successfully");
	}

	public static void main(String[] args) throws Exception {
// Send a test message
		send("192.168.70.231", 25, "rajendraj@alohatechnologydev.com", "vishalmurkute@alohatechnologydev.com", "test", "this message send by selenium autom.");
	}
}
