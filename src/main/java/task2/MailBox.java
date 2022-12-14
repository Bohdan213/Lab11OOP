package task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();
    private MailSender mailSender;
    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for(MailInfo info: infos) {
            mailSender.sendMail();
        }
    }
}
