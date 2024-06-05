import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phones {
    private Map<String, Set<String>> phonebook;

    public Phones() {
        phonebook = new HashMap<>();
    }

    public void add(String family, String number) {
        Set<String> numbers = phonebook.get(family);
        if (numbers == null) {
            numbers = new HashSet<>();
            phonebook.put(family, numbers);
        }
        numbers.add(number);
    }

    public Set<String> get(String family) {
        Set<String> numbers = phonebook.get(family);
        if (numbers == null) {
            return new HashSet<>();
        } else {
            return numbers;
        }
    }
}
