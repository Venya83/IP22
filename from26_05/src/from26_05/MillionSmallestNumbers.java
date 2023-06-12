package from26_05;

import java.util.PriorityQueue;
import java.util.Random;

public class MillionSmallestNumbers {
    public static void main(String[] args) {
        int N = 1_000_000; // Количество наименьших чисел, которые нужно найти
        int[] numbers = generateNumbers(1_000_000_000); // Сгенерировать миллиард чисел

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : numbers) {
            minHeap.offer(num);
            if (minHeap.size() > N) {
                minHeap.poll();
            }
        }

        // Вывести наименьшие числа
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }

    // Метод для генерации миллиарда чисел
    private static int[] generateNumbers(int limit) {
        int[] numbers = new int[limit];
        Random random = new Random();
        for (int i = 0; i < limit; i++) {
            numbers[i] = random.nextInt();
        }
        return numbers;
    }
}
