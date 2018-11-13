/**
 * Created by jihun on 2018. 11. 13..
 */

class Solution {
    public int[] solution(int brown, int red) {
        int[] answer = new int[2];

        for (int row = 1; row <= red; row++) {
            if (red % row == 0) {
                int col = red / row;
                if (2 * col + 2 * row + 4 == brown) {
                    answer[0] = col + 2;
                    answer[1] = row + 2;
                    break;
                }
            }
        }

        return answer;
    }
}
