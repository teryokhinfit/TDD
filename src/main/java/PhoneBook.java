import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> cont = new TreeMap<>();

    public boolean add(String name, String number) {
        return cont.putIfAbsent(name, number) == null;
    }
}
