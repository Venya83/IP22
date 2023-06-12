package from_02_06;

import java.util.HashMap;
import java.util.Map;

public class Task_05 {
    public static void main(String[] args) {
        String input = "You can't hurt me, Jack!";

        // Создание HashMap для подсчета слов
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Разделение строки на слова и подсчет количества каждого слова
        String[] words = input.split(" ");
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                // Увеличение счетчика для существующего слова
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                // Добавление нового слова со счетчиком 1
                wordCountMap.put(word, 1);
            }
        }

        // Вывод результата подсчета
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
