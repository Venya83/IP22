package from_02_06;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " - число Армстронга");
        } else {
            System.out.println(number + " - не число Армстронга");
        }
    }

    // Метод для проверки числа Армстронга
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return originalNumber == sum;
    }
}
