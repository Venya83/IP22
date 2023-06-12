package from_02_06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_06 {
    public static void main(String[] args) {
        // Создание объекта HashMap и заполнение данными
        Map<String, Integer> map = new HashMap<>();
        map.put("Self-tapping screw", 29279);
        map.put("Atomic disintegrator", 3);
        map.put("Antimass spectrometer", 2);

        // Итерация с использованием цикла while
        System.out.println("Итерация с использованием цикла while:");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Итерация с использованием улучшенного цикла for
        System.out.println("\nИтерация с использованием улучшенного цикла for:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
