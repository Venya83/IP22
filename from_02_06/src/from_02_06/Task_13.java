package from_02_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Подсчет количества вхождений каждого символа в строке
        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println("Повторяющиеся символы в строке:");
        // Вывод повторяющихся символов и их количество
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
