package from02_05;

import java.util.Scanner;

public class Ch06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = input.nextInt();

        System.out.println("Введите номер:");
        int num = input.nextInt();

        int sum = 0;
        System.out.println("Первые " + n + " натуральных чисел:");

        for (int i = num; i < num + n; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Сумма натурального числа до " + (num + n - 1) + " слагаемых: " + sum);
    }
}
