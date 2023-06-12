package from_02_06;

public class Task_03 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Обмен значениями с помощью третьей переменной
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nРеверсировал");
        System.out.println("\na = " + a);
        System.out.println("b = " + b);
    }
}
