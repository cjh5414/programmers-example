package Q3;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[][] board, int[] nums) {
        int n = board.length;
        HashSet set = new HashSet(Arrays.asList(nums));

        int answer = 0;
        boolean rowBingo, colBingo;
        boolean bingo1 = true, bingo2 = true;

        for (int i = 0; i < n; i++) {
            if (!set.contains(board[i][i])) bingo1 = false;
            if (!set.contains(board[i][n - i - 1])) bingo2 = false;

            rowBingo = colBingo = true;
            for (int j = 0; j < n; j++) {
                if (!set.contains(board[i][j]))
                    rowBingo = false;

                if (!set.contains(board[j][i])) {
                    colBingo = false;
                    if (!rowBingo) break;
                }
            }

            if (rowBingo) answer++;
            if (colBingo) answer++;
        }

        if (bingo1) answer++;
        if (bingo2) answer++;

        return answer;
    }
}
