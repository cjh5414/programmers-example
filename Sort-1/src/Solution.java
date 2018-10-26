import java.util.Arrays;

/**
 * Created by jihun on 2018. 10. 25..
 */
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] cmd = commands[i];
            int len = cmd[1] - cmd[0] + 1;
            int[] tmp = new int[len];

            System.arraycopy(array, cmd[0] - 1, tmp, 0, len);
            Arrays.sort(tmp);
            answer[i] = tmp[cmd[2] - 1];
        }

        return answer;
    }
}
