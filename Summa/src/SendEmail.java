
// File Name SendEmail.java

import java.io.UnsupportedEncodingException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// Recipient's email ID needs to be mentioned.
	      try
	        {
	    	  String to = "shanmuga86@gmail.com"; //user email 
	    	  String time = "";

	    	  String body = "<html><body>Sir/Mam, <br> Thank you for your interest in Verizon.<br>"
	    	  		+ "We visit your place on "+time+" for survey. <BR> Thanks for your co-operation. <br>"
	    	  				+ "<b>Verizon Survey Team  </b><br> <br> "
	    	  				+ "<img src=\"http://ss7.vzw.com/is/image/VerizonWireless/vzw-logo-156-130-c\"><br> "
	    	  				+ "</body> <H1> Better Matters </H1></html>";
	    	  String sub = "Verizon Site Survey";
	    	  
	    	  final String fromEmail = "shyam.hackathon@gmail.com"; //requires valid gmail id
	          final String password = "HackMe@123"; // correct password for gmail id
	          
	           
	          System.out.println("TLSEmail Start");
	          Properties props = new Properties();
	          props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
	          props.put("mail.smtp.port", "587"); //TLS Port
	          props.put("mail.smtp.auth", "true"); //enable authentication
	          props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
	           
	                  //create Authenticator object to pass in Session.getInstance argument
	          Authenticator auth = new Authenticator() {
	              //override the getPasswordAuthentication method
	              protected PasswordAuthentication getPasswordAuthentication() {
	                  return new PasswordAuthentication(fromEmail, password);
	              }
	          };
	          Session session = Session.getInstance(props, auth);
	          MimeMessage msg = new MimeMessage(session);
	         
	          //set message headers
	          msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
	          msg.addHeader("format", "flowed");
	          msg.addHeader("Content-Transfer-Encoding", "8bit");
	 
	          msg.setFrom(new InternetAddress("shyam.hackathon@gmail.com", "DonotReply@Verizon"));
//	          msg.setReplyTo(InternetAddress.parse("shyam.hackathon@gmail.com", false));
	          msg.setSubject(sub, "UTF-8");
	          msg.setContent(body, "text/html");
	          msg.setSentDate(new Date());
	          msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
	          System.out.println("Message is ready");
	          Transport.send(msg);  
	 
	          System.out.println("EMail Sent Successfully!!");
      		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}
