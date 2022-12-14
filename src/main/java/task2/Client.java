package task2;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Client {
    @Generated
    private int id;
    private String name;
    private String email;
    private int age;
    private Gender gender;
}
