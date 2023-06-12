package from26_05;

public class CelebrityFinder {
    public int findCelebrity(int[][] knows, int K) {
        int celebrity = 0;

        for (int i = 1; i < K; i++) {
            if (knows(celebrity, i, knows)) {
                celebrity = i;
            }
        }

        for (int i = 0; i < K; i++) {
            if (i != celebrity && (knows(celebrity, i, knows) || !knows(i, celebrity, knows))) {
                return -1;
            }
        }

        return celebrity;
    }

    private boolean knows(int a, int b, int[][] knows) {
        return knows[a][b] == 1;
    }
}
