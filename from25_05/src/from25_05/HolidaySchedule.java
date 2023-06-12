package from25_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HolidaySchedule {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("График праздников на " + year + " год:");

        // Печать праздников на текущий год
        printHoliday("Новый год", LocalDate.of(year, 1, 1), formatter);
        printHoliday("Международный женский день", LocalDate.of(year, 3, 8), formatter);
        printHoliday("Праздник труда", LocalDate.of(year, 5, 1), formatter);
        printHoliday("День рождения Hololive", LocalDate.of(year, 9, 7), formatter); // День рождения Hololive
    }

    private static void printHoliday(String holidayName, LocalDate holidayDate, DateTimeFormatter formatter) {
        System.out.println(holidayName + ": " + holidayDate.format(formatter));
    }
}
