package from_02_06;

public class Task_14 {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 2, 11, 3, 7, 8};
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Второго по величине числа нет");
        } else {
            System.out.println("Второе по величине число: " + secondLargest);
        }
    }
}
