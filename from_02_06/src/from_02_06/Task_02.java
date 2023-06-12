package from_02_06;

public class Task_02 {
    public static void main(String[] args) {
        String input = "level";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length / 2; i++) {
            // Обмен символами
            char temp = characters[i];
            characters[i] = characters[length - i - 1];
            characters[length - i - 1] = temp;
        }

        return new String(characters);
    }
}
