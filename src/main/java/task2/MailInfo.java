package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MailInfo {
    private Client client;
    private MailCode type;
}
