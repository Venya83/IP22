package from26_05;

public class Main2 {
    public static void main(String[] args) {
        CelebrityFinder finder = new CelebrityFinder();

        int K = 4;
        int[][] knows = {
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0}
        };

        int celebrity = finder.findCelebrity(knows, K);
        if (celebrity != -1) {
            System.out.println("Знаменитость: " + celebrity);
        } else {
            System.out.println("В группе нет знаменитости.");
        }
    }
}
