package task1;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Client extends User{
    private String ip;

    @Override
    public String toString() {
        return "Client{" +
                "super=" + super.toString()+
                " ip='" + ip +
                '}';
    }
}
