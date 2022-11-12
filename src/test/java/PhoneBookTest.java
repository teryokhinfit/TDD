import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class PhoneBookTest {

    @BeforeAll
    public static void started () {
        System.out.println("test started");
    }

    @AfterAll
    public static void finishedAll () {
        System.out.println("all test completed");
    }

    @Test
    public void addContact() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Vasya";
        String number = "+7 912 345 67 89";
        assertThat(phoneBook.add(name, number)).isTrue();
    }

    @Test
    public void findByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Vasya";
        String number = "+7 912 345 67 89";
        assertThat(phoneBook.findByNumber(number)).isEqualTo(name);
    }



    @Test
    public void FindByName() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Vasya";
        String number = "+7 912 345 67 89";
        phoneBook.add(name, number);
        assertThat(phoneBook.findByName(name)).isEqualTo(number);
    }


}
