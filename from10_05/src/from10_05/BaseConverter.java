package from10_05;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        System.out.println("Выберите шкалу для конвертации: ");
        System.out.println("1. Кельвин");
        System.out.println("2. Фаренгейт");
        int choice = scanner.nextInt();

        double result = 0.0;
        switch(choice) {
            case 1:
                result = celsius + 273.15; // формула конвертации в градусы Кельвина
                System.out.println("Температура в градусах Кельвина: " + result);
                break;
            case 2:
                result = celsius * 1.8 + 32; // формула конвертации в градусы Фаренгейта
                System.out.println("Температура в градусах Фаренгейта: " + result);
                break;
            default:
                System.out.println("Неверный выбор.");
        }
    }
}
