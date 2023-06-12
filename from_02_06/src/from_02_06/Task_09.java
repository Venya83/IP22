package from_02_06;

import java.util.ArrayList;
import java.util.Iterator;

public class Task_09 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Self-tapping screw");
        list.add("Atomic disintegrator");
        list.add("Antimass spectrometer");

        System.out.println("Обход с использованием цикла for:");
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.println(element);
        }

        System.out.println("\nОбход с использованием цикла while:");
        int index = 0;
        while (index < list.size()) {
            String element = list.get(index);
            System.out.println(element);
            index++;
        }

        System.out.println("\nОбход с использованием улучшенного цикла for:");
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("\nОбход с использованием итератора:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
