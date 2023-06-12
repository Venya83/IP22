package from02_05;

import java.util.Scanner;

public class Ch07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите 5 цифр:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        double avg = (double) sum / 5;

        System.out.println("Сумма 5 чисел: " + sum);
        System.out.printf("Среднее значение: %.1f", avg);
    }
}
