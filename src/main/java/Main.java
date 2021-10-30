import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String sentence = """
                Some people talk and talk
                and never say a thing.
                Some people look at you
                and birds begin to sing.
                """;
        String[] words = sentence.split("\\W");
        HashMap<String, Integer> wordsCount = new HashMap<>();

        for(String word: words) {
            if (word.isEmpty()) continue;
            if (wordsCount.get(word) == null) {
                wordsCount.put(word, 1);
            } else {
                Integer count = wordsCount.get(word) + 1;
                wordsCount.put(word, count);
            }
        }

        Integer totalWords = 0;
        for(Map.Entry<String, Integer> entry: wordsCount.entrySet()) {
            totalWords += entry.getValue();
            System.out.println("Слово " + entry.getKey() + " встречается " + entry.getValue() + " раз");
        }
        System.out.println("Всего слов: " + totalWords);

        System.out.println("\n\n===================================\n\n");

        Phonebook book = new Phonebook();
        book.add("Петров", "89033713359");
        book.add("Пастухов", "88002000600");
        book.add("Иванов", "39495534");
        book.add("Лусто", "4332553253");
        book.add("Пастухов", "8333490022233");
        book.add("Пастухов", "777-333-455");

        System.out.println("У Петрова номера: " + book.get("Петров"));
        System.out.println("У Пастухова номера: " + book.get("Пастухов"));
    }
}
