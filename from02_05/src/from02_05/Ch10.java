package from02_05;

import java.util.Scanner;

public class Ch10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество терминов: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        System.out.println("Нечетные числа:");
        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            System.out.println(odd);
            sum += odd;
        }
        
        System.out.println("Сумма нечетного натурального числа до " + n + " слагаемых: " + sum);
    }
}
