package from02_05;

import java.util.Scanner;

public class Ch11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
