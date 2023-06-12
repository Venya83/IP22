package from02_05;

import java.util.Scanner;

public class Ch15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num % 2);
                num++;
            }
            System.out.println();
        }
    }
}
