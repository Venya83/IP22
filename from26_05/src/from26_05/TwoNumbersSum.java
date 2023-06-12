package from26_05;

import java.util.Arrays;

public class TwoNumbersSum {
    public static void main(String[] args) {
        int[] numbers = {-4, -2, 1, 3, 5, 7, 9};
        int target = 6;

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                System.out.println("Найдены два числа: " + numbers[left] + " и " + numbers[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Не найдены два числа, дающие сумму " + target);
    }
}
