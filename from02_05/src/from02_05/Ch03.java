package from02_05;

import java.util.Scanner;

public class Ch03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите букву алфавита: ");
        String input = scanner.next().toLowerCase();

        if (input.length() != 1) {
            System.out.println("Ошибка: нужно ввести одну букву");
        } else {
            char letter = input.charAt(0);
            if (!Character.isLetter(letter)) {
                System.out.println("Ошибка: нужно ввести букву");
            } else if ("aeiouаеёиоуыэюя".indexOf(letter) != -1) {
                System.out.println("Введенный символ является гласным");
            } else {
                System.out.println("Введенный символ является согласным");
            }
        }
    }
}
