package Library;
import org.apache.commons.mail.SimpleEmail;

// neki projekat da mozemo da seljemo email na gmail

public class Util {
    public static void sendEmails(String username, String password, String receiver, String subject, String MSG){
        receiver = receiver.toLowerCase();
        if(receiver.contains("muhtar")){
            System.err.print("Invalid Email address");
            System.exit(1);
        }
        SimpleEmail email=new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication(username, password);
        email.setSSLOnConnect(true);
        email.setSubject(subject);
        try {
            email.setFrom(username);
            email.setMsg(MSG);
            email.addTo(receiver);
            email.send();
            Thread.sleep(1500);
        } catch (Exception e) {   }

    }
}
