/**
 * Created by jihun on 2018. 10. 13..
 */

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        int days = 0;
        int count = 1;
        int idx = 0;

        while (progresses[0] + speeds[0] * days < 100) days++;
        for (int i = 1; i < progresses.length; i++) {
            if (progresses[i] + speeds[i] * days < 100) {
                answer[idx++] = count;
                count = 1;
                if (i == progresses.length - 1) answer[idx] = 1;
                while (progresses[i] + speeds[i] * days < 100) days++;
            }

            else {
                count++;
                if (i == progresses.length - 1) answer[idx] = count;
            }
        }

        int[] ret = new int[idx + 1];
        System.arraycopy(answer, 0, ret, 0, idx + 1);
        return ret;
    }
}
