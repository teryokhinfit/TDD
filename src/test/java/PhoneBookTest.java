import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

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


    @Test
    public void whenPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        String name1 = "Vasya";
        String number1 = "+7 912 345 67 89";
        String name2 = "Kolya";
        String number2 = "+7 912 345 67 98";
        String name3 = "Sveta";
        String number3 = "+7 912 345 67 00";
        phoneBook.add(name1, number1);
        phoneBook.add(name2, number2);
        phoneBook.add(name3, number3);
        List<String> expected = List.of(name2, name3, name1);
        assertThat(phoneBook.printAllNames()).isEqualTo(expected);
    }


}
