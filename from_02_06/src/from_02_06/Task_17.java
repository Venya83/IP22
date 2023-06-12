package from_02_06;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        // Удаление пробелов без использования replace()
        String stringWithoutSpaces = removeSpaces(inputString);

        System.out.println("Строка без пробелов: " + stringWithoutSpaces);
    }

    // Метод для удаления пробелов из строки
    public static String removeSpaces(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : charArray) {
            if (c != ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
