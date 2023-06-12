package from_02_06;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи строку: ");
        String inputString = scanner.nextLine();

        // Удаление пробелов с помощью replace()
        String stringWithoutSpaces = inputString.replace(" ", "");

        System.out.println("Пробелы отправлены в Бразилию: " + stringWithoutSpaces);
    }
}
