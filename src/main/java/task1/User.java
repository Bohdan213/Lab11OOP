package task1;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

enum Gender {
    MALE, FEMALE
}
@SuperBuilder
@ToString
@AllArgsConstructor
@Getter
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular(value = "професія")
    private List<String> occupations;

}