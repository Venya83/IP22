package from_02_06;

import java.util.ArrayList;
import java.util.List;

public class Task_10 {
    private static final int MAX_CAPACITY = 5;
    private static List<Integer> buffer = new ArrayList<>();

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    synchronized (buffer) {
                        while (buffer.size() == MAX_CAPACITY) {
                            System.out.println("Склад переполнен. Производство подождёт...");
                            buffer.wait();
                        }

                        buffer.add(i);
                        System.out.println("Чехлов для телевизоров произведено: " + i);
                        buffer.notifyAll();
                    }

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                try {
                    synchronized (buffer) {
                        while (buffer.isEmpty()) {
                            System.out.println("Склад пустует. Производство набирает обороты...");
                            buffer.wait();
                        }

                        int value = buffer.remove(0);
                        System.out.println("Чехлов для телевизоров продано: " + value);
                        buffer.notifyAll();
                    }

                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
