package from02_05;

import java.util.Scanner;

public class Ch14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
            num++;
        }
        sc.close();
    }
}
