package Servletpage;
								
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail
{
	public String getRandom()
	{
		Random rnd = new Random();
		int number = rnd.nextInt(999999);
		return String.format("%06d", number);
	}
    //send email to the user email
	public boolean sendEmail(User user)
	{
		boolean test = false;
		String toEmail = user.getUserLoginId();
		try
		{
			Properties pr=new Properties();
			pr.put("mail.smtp.auth", "true");
			pr.put("mail.smtp.starttls.enable", "true");
			pr.put("mail.smtp.host", "smtp.gmail.com");
			pr.put("mail.smtp.port", "587");
			String fromEmail = "helpinghand8103@gmail.com";
			String password = "Helping@8103";
			//get session to authenticate the host email address and password
			Session session = Session.getInstance(pr, new Authenticator()
			{
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(fromEmail, password);
				}
			});
			//set email message details
			Message mess = new MimeMessage(session);
			//set from email address
			mess.setFrom(new InternetAddress(fromEmail));
			//set to email address or destination email address
			mess.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			//set email subject
			mess.setSubject("User Email Verification");
			//set message text
			mess.setText("Registered successfully.: "+user.getFirstName());
			//send the message
			Transport.send(mess);	
			test=true;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return test;
}}

    