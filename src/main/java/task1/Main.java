package task1;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Bohdan")
                .age(19)
                .height(183)
                .weight(65)
                .професія("UCU")
                .професія("student")
                .build();
        User client = Client.builder()
                .name("Bohdan")
                .age(19)
                .height(184)
                .weight(65)
                .професія("UCU")
                .професія("student")
                .ip("123456789")
                .build();
        System.out.println(user);
        System.out.println(client);
    }
}
