/**
 * Created by jihun on 2018. 10. 13..
 */

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[100];
        int days = 0;
        int count = 0;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + days * speeds[i] < 100)
                days++;
            if (answer[days] == 0) count++;
            answer[days]++;
        }

        int[] ret = new int[count];
        int idx = 0;
        for (int i = 0; i < 100; i++) {
            if (answer[i] != 0)
                ret[idx++] = answer[i];
        }

        return ret;
    }
}
