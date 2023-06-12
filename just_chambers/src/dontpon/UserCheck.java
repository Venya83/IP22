package dontpon;

import java.util.Scanner;

public class UserCheck {
public static boolean validate(String login, String password, String confirmPassword) {
try {
if (!login.matches("[user]+") || login.length() >= 20) {
throw new WrongLoginException("Неверный логин");
}
if (!password.matches("[pass]+") || password.length() >= 20 || !password.equals(confirmPassword)) {
throw new WrongPasswordException("Неверный пароль");
}
return true;
} catch (WrongLoginException | WrongPasswordException e) {
System.out.println(e.getMessage());
return false;
}
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите логин:");
    String login = scanner.nextLine();
    System.out.println("Введите пароль:");
    String password = scanner.nextLine();
    System.out.println("Подтвердите пароль:");
    String confirmPassword = scanner.nextLine();

    boolean result = validate(login, password, confirmPassword);
    System.out.println(result);
}
}

class WrongLoginException extends Exception {
public WrongLoginException() {
super();
}
public WrongLoginException(String message) {
    super(message);
}
}

class WrongPasswordException extends Exception {
public WrongPasswordException() {
super();
}
public WrongPasswordException(String message) {
    super(message);
}
}