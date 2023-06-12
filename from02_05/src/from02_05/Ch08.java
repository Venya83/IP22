package from02_05;

import java.util.Scanner;

public class Ch08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество терминов: ");
        int n = input.nextInt();
        System.out.println("Числа и их кубы:");
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Число: " + i + " и куб " + i + ": " + cube);
        }
    }
}
