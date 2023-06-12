package dontpon;

import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        // Создаем массив, содержащий числа от 1 до 100, с одним продублированным элементом
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        int dup = (int) (Math.random() * 100) + 1; // выбираем случайный элемент для дублирования
        nums[(int) (Math.random() * 100)] = dup;
        
        // Ищем продублированный элемент
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                System.out.println("Duplicate: " + nums[i]);
                break;
            } else {
                set.add(nums[i]);
            }
        }
    }
}
