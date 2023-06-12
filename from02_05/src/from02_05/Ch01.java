package from02_05;

import java.util.Scanner;

public class Ch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число с плавающей точкой: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите второе число с плавающей точкой: ");
        double secondNumber = scanner.nextDouble();

        boolean areEqual = Math.abs(firstNumber - secondNumber) < 0.001;
        if (areEqual) {
            System.out.println("Они равны");
        } else {
            System.out.println("Они разные");
        }
    }
}
