package from02_05;

import java.util.Scanner;

public class Ch09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число (Таблица умножения): ");
        int number = input.nextInt();
        System.out.print("Введите число членов: ");
        int limit = input.nextInt();

        for (int i = 0; i <= limit; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }
}
