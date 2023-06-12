package from_05_06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task_01 {
    public static void main(String[] args) {
        try {
            // Чтение входных данных из файла INPUT.TXT
            BufferedReader reader = new BufferedReader(new FileReader("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\from_05_06\\src\\from_05_06\\INPUT.TXT"));
            String[] inputLine = reader.readLine().split(" ");
            int N = Integer.parseInt(inputLine[0]);
            int M = Integer.parseInt(inputLine[1]);
            int K = Integer.parseInt(inputLine[2]);

            char[][] preferences = new char[N][M];
            for (int i = 0; i < N; i++) {
                preferences[i] = reader.readLine().toCharArray();
            }
            reader.close();

            // Вычисление количества способов
            int result = countWays(N, M, K, preferences);

            // Запись результата в файл OUTPUT.TXT
            FileWriter writer = new FileWriter("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\ИП22\\Поляков Н\\Клипса\\from_05_06\\src\\from_05_06\\OUTPUT.TXT");
            writer.write(Integer.toString(result));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countWays(int N, int M, int K, char[][] preferences) {
        int[][] dp = new int[N + 1][M + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (preferences[i - 1][j - 1] == 'Y') {
                    for (int k = 0; k < j; k++) {
                        dp[i][j] += dp[i - 1][k];
                    }
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[N][M];
    }
}
