import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> cont = new TreeMap<>();

    public boolean add(String name, String number) {
        return cont.putIfAbsent(name, number) == null;
    }

    public String findByNumber(String number) {
        String name = "Такого номера нет в списке ваших контактов";
        for (Map.Entry<String, String> entry : cont.entrySet()) {
            if (entry.getValue().equals(number)) {
                name = entry.getKey();
            }
        }
        return name;
    }

    public String findByName(String name) {
        return cont.get(name) == null ? "Контакт не найден" : cont.get(name);
    }




}
