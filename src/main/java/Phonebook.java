import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {
    HashMap<String, Set<String>> data;

    public Phonebook() {
        data = new HashMap<>();
    }

    public void add(String name, String phone) {
        if (data.get(name) == null) {
            Set<String> phones = new HashSet<>();
            phones.add(phone);
            data.put(name, phones);
        } else {
            data.get(name).add(phone);
        }
    }

    public Set<String> get(String name) {
        return data.get(name);
    }
}
