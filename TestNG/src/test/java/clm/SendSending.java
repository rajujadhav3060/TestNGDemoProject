package clm;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class SendSending {

	public static void main(String[] args) {
		  final String fromEmail = "rajendraj@alohatechnologydev.com"; //requires valid id
          final String password = "ijtrysqeyvwxxkxx"; // correct password for gmail id
          final String toEmail = "vishalmurkute@alohatechnologydev.com"; // can be any email id

          System.out.println("TLSEmail Start");
          Properties props = new Properties();
          props.put("mail.smtp.host", "smtp.mail.yahoo.com"); //SMTP Host
          props.put("mail.smtp.port", "25"); //TLS Port
          props.put("mail.smtp.auth", "Required"); //enable authentication
          props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS

          //create Authenticator object to pass in Session.getInstance argument
                  System.out.println("Calling getPasswordAuthentication");
          Authenticator auth = new Authenticator() {
                  //override the getPasswordAuthentication method
                  protected PasswordAuthentication getPasswordAuthentication() {
                          return new PasswordAuthentication(fromEmail, password);
                  }
          };
                  System.out.println("After getPasswordAuthentication");
          Session session = Session.getInstance(props, auth);

         // EmailUtil.SendEmail(session, toEmail,"My First TLSEmail Testing Subject", "My first email client. TLSEmail Testing Body");

  }
}
