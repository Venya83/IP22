package from02_05;

import java.util.Scanner;

public class Ch13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = input.nextInt();
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
