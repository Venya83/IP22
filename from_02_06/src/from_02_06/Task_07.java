package from_02_06;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи циферу: ");
        int number = scanner.nextInt();

        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " - простое число");
        } else {
            System.out.println(number + " - не является простым числом");
        }
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        // Проверка делителей от 2 до корня из числа
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
