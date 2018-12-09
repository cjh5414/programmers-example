/**
 * Created by jihun on 2018. 11. 14..
 */

class Solution {
    private int n;
    private int count = 0;
    private int[][] computers;
    private boolean[] check;

    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        this.check = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                count++;
                checkSet(i);
            }
        }

        return count;
    }
    void checkSet(int i) {
        if (!check[i]) {
            check[i] = true;
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1) checkSet(j);
            }
        }
    }
}

