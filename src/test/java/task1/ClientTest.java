package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    public static User user = User.builder()
            .name("Bohdan")
            .age(19)
            .height(183)
            .weight(65)
            .професія("UCU")
            .професія("student")
            .build();
    public static User client = Client.builder()
            .name("Bohdan")
            .age(19)
            .height(184)
            .weight(65)
            .професія("UCU")
            .професія("student")
            .ip("123456789")
            .build();

    @Test
    public void testClient() {
        assertEquals(client.toString(), "Client{super=User(name=Bohdan, age=19, gender=null, weight=65.0, height=184.0, occupations=[UCU, student]) ip='123456789}");
        assertEquals(client.getAge(), user.getAge());
        assertEquals(client.getWeight(), user.getWeight());
        assertNotEquals(client.getHeight(), user.getHeight());
    }

    @Test
    public void testUser() {
        assertEquals(user.toString(), "User(name=Bohdan, age=19, gender=null, weight=65.0, height=183.0, occupations=[UCU, student])");
        assertEquals(client.getAge(), user.getAge());
        assertEquals(client.getWeight(), user.getWeight());
        assertNotEquals(client.getHeight(), user.getHeight());
    }
}