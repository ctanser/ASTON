import java.util.HashMap;
import java.util.Map;

public class Words {
    public static void main(String[] args) {
        String[] words = {"Кот", "Собака", "Кот", "Миска", "Собака", "Еда", "Кот", "Животное", "Собака", "Животное", "Кот", "Собака"};

        // Находим список уникальных слов
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим список уникальных слов и количество повторений
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

