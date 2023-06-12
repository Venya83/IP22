package from_02_06;

public class Task_04 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Обмен значениями без использования третьей переменной
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nСтар-реверсатинум!");
        System.out.println("\na = " + a);
        System.out.println("b = " + b);
    }
}
