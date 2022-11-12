public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vasya", "+7 912 345 67 89");
        phoneBook.add("Kolya", "+7 912 345 67 98");
        phoneBook.add("Sveta", "+7 912 345 67 00");

        System.out.println(phoneBook.findByNumber("+7 912 345 67 89"));
        System.out.println(phoneBook.findByNumber("+7 912 345 67 85"));
        System.out.println(phoneBook.findByNumber("+7 912 345 67 00") +"\n");

        System.out.println(phoneBook.findByName("Kolya"));
        System.out.println(phoneBook.findByName("Igor"));
        System.out.println(phoneBook.findByName("Vasya")+"\n");

        System.out.println(phoneBook.printAllNames());


    }


}
