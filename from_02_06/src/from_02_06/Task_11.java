package from_02_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_11 {
    private static final int PAGE_SIZE = 10;

    public static void main(String[] args) {
        List<String> data = generateData(100); // Генерация данных для демонстрации

        int startIndex = 0;
        int endIndex = Math.min(startIndex + PAGE_SIZE, data.size());

        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            // Вывод текущей страницы данных
            for (int i = startIndex; i < endIndex; i++) {
                System.out.println(data.get(i));
            }

            System.out.println("-----------------------------");
            System.out.println("Страница: " + (startIndex / PAGE_SIZE + 1));
            System.out.println("Всего страниц: " + (int) Math.ceil((double) data.size() / PAGE_SIZE));
            System.out.println("-----------------------------");
            System.out.println("Введите команду: (u - вверх, d - вниз, q - выход)");

            String command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "u": // Прокрутка вверх
                    if (startIndex - PAGE_SIZE >= 0) {
                        startIndex -= PAGE_SIZE;
                        endIndex -= PAGE_SIZE;
                    }
                    break;
                case "d": // Прокрутка вниз
                    if (endIndex + PAGE_SIZE <= data.size()) {
                        startIndex += PAGE_SIZE;
                        endIndex += PAGE_SIZE;
                    }
                    break;
                case "q": // Выход
                    running = false;
                    break;
                default:
                    System.out.println("Некорректная команда. Повторите ввод.");
                    break;
            }
        }

        System.out.println("Программа завершена.");
    }

    // Генерация данных для демонстрации
    private static List<String> generateData(int size) {
        List<String> data = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            data.add("Элемент " + i);
        }

        return data;
    }
}
