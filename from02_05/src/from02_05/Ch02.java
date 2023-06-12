package from02_05;

import java.util.Scanner;

public class Ch02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int daysInMonth;
        switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }

        System.out.printf("В %s %d года %d дней\n",
                getMonthName(month), year, daysInMonth);
    }

    private static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "январе";
            case 2:
                return "феврале";
            case 3:
                return "марте";
            case 4:
                return "апреле";
            case 5:
                return "мае";
            case 6:
                return "июне";
            case 7:
                return "июле";
            case 8:
                return "августе";
            case 9:
                return "сентябре";
            case 10:
                return "октябре";
            case 11:
                return "ноябре";
            case 12:
                return "декабре";
            default:
                throw new IllegalArgumentException("Invalid month number: " + month);
        }
    }
}
