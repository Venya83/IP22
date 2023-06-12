package from_02_06;

public class Task_01 {
    public static void main(String[] args) {
        String input = "level";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Обмен символами
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Переход к следующим символам
            left++;
            right--;
        }

        return new String(characters);
    }
}
