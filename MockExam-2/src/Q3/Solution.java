package Q3;

import java.util.HashMap;

class Solution {
    public int solution(int[][] board, int[] nums) {
        int n = board.length;
        HashMap map = new HashMap<Integer, Position>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map.put(board[i][j], new Position(i, j));
            }
        }

        for (int val : nums) {
            Position p = (Position)map.get(val);
            board[p.x][p.y] = 0;
        }

        int answer = 0;
        boolean rowBingo, colBingo;

        for (int i = 0; i < n; i++) {
            rowBingo = true;
            colBingo = true;
            for (int j = 0; j < n; j++) {
                if (board[i][j] != 0) {
                    rowBingo = false;
                }

                if (board[j][i] != 0) {
                    colBingo = false;
                    if (!rowBingo) break;
                }
            }

            if (rowBingo) answer++;
            if (colBingo) answer++;
        }

        boolean bingo1 = true;
        boolean bingo2 = true;
        for (int i = 0; i < n; i++) {
            if (board[i][i] != 0) {
                bingo1 = false;
            }
            if (board[i][n - i - 1] != 0) {
                bingo2 = false;
                if (!bingo1) break;
            }
        }

        if (bingo1) answer++;
        if (bingo2) answer++;

        return answer;
    }

    class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
