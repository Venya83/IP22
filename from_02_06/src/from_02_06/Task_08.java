package from_02_06;

import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку или число: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " - палиндром");
        } else {
            System.out.println(input + " - не является палиндромом");
        }
    }

    // Метод для проверки, является ли строка или число палиндромом
    public static boolean isPalindrome(String input) {
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanInput.length() - 1;

        while (left < right) {
            if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
