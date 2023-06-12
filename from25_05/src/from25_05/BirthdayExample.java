package from25_05;

import java.time.LocalDate;

public class BirthdayExample {
    public static void main(String[] args) {
        // Создание объекта LocalDate с указанием даты рождения
        LocalDate birthday = LocalDate.of(1990, 5, 10);

        // Вывод информации о дне недели, дне в году, месяце и годе
        System.out.println("День недели: " + birthday.getDayOfWeek());
        System.out.println("День в году: " + birthday.getDayOfYear());
        System.out.println("Месяц: " + birthday.getMonth());
        System.out.println("Год: " + birthday.getYear());

        // Создание объекта LocalDate, представляющего текущее время
        LocalDate currentDate = LocalDate.now();

        // Сравнение текущего времени со днем рождения
        if (currentDate.isAfter(birthday)) {
            System.out.println("Уже прошло ваше день рождение.");
        } else if (currentDate.isBefore(birthday)) {
            System.out.println("Ваше день рождение еще не наступило.");
        } else {
            System.out.println("Сегодня ваше день рождение!");
        }
    }
}
