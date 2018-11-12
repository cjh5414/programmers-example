/**
 * Created by jihun on 2018. 11. 12..
 */
class Solution {
    int[][] baseball;
    public int solution(int[][] baseball) {
        this.baseball = baseball;
        int count = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == j) continue;
                for (int k = 1; k < 10; k++) {
                    if (k == j || k == i) continue;
                    if (isCorrect(i, j, k)) count++;
                }
            }
        }

        return count;
    }

    boolean isCorrect(int i, int j, int k) {
        for (int l = 0; l < baseball.length; l++) {
            int s = 0, b = 0;
            int ii = baseball[l][0] / 100;
            int jj = (baseball[l][0] % 100) / 10;
            int kk = baseball[l][0] % 10;

            if (ii == i) s++;
            else if (ii == j || ii == k) b++;

            if (jj == j) s++;
            else if (jj == i || jj == k) b++;

            if (kk == k) s++;
            else if (kk == i || kk == j) b++;

            if (s != baseball[l][1] || b != baseball[l][2])
                return false;
        }

        return true;
    }
}