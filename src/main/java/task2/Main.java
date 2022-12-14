package task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public class Main {
    public static void main(String[] args) throws MailjetSocketTimeoutException, MailjetException {
        MailSender sender = new MailSender();
        Client user = new Client(1, "Bohdan", "lalabohdan@gmail.com", 19, Gender.MALE);
        MailInfo info = new MailInfo(user, MailCode.LETTER);
        sender.sendMail(info);
    }
}
