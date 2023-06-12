package from26_05;

import java.util.Stack;

public class DaysUntilWarmerDay {
    public static void main(String[] args) {
        int[] temperatures = {17, 16, 19, 15, 13, 18, 20};

        int[] daysUntilWarmer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                daysUntilWarmer[idx] = i - idx;
            }
            stack.push(i);
        }

        for (int days : daysUntilWarmer) {
            System.out.print(days + " ");
        }
    }
}
