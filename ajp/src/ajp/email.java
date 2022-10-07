package ajp;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class email
{
	public void emailsend(String to)
	{
		final String SenderEmail ="dineshdhayfule@gmail.com";
		final String Password="exrwbmbpygqruzty";
		
		Properties prop = new Properties();
		prop.put("mail.smtp.auth","true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port","587");
		
		Session session = Session.getInstance(prop, 
				new javax.mail.Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(SenderEmail,Password);
			};
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("dineshdhayfule@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
			message.setSubject("VACCINATION BOOKING");
			message.setText("WELCOME TO VACCINATION");
			
			Transport.send(message);
			System.out.println("Send successfully");
			
			
		}
		catch(MessagingException e)
		{
			throw new RuntimeException(e);
		}
	}
//	public static void main(String ar[])
//	{
//		email e = new email();
//		e.emailsend("dhayfuledinesh@gmail.com");
//	}
}