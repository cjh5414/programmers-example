import java.util.ArrayList;

/**
 * Created by jihun on 2018. 11. 7..
 */
class Solution {
    public int[] solution(int[] answers) {
        final int[][] guesses = {{1, 2, 3, 4, 5},
        {2, 1, 2, 3, 2, 4, 2, 5},
        {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int[] correctNum = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (guesses[j][i % (guesses[j].length)] == answers[i])
                    correctNum[j]++;
            }
        }

        int[] answer = {};

        if (correctNum[0] > correctNum[1]) {
            if (correctNum[0] > correctNum[2]) {
                answer = new int[1];
                answer[0] = 1;
            }
            else if (correctNum[2] > correctNum[0]) {
                answer = new int[1];
                answer[0] = 3;
            }
            else {
                answer = new int[2];
                answer[0] = 1;
                answer[1] = 3;
            }
        }
        else if (correctNum[0] < correctNum[1])
            if (correctNum[1] > correctNum[2]) {
                answer = new int[1];
                answer[0] = 2;
            }
            else if (correctNum[2] > correctNum[1]) {
                answer = new int[1];
                answer[0] = 3;
            }
            else {
                answer = new int[2];
                answer[0] = 2;
                answer[1] = 3;
            }
        else {
            if (correctNum[0] > correctNum[2]) {
                answer = new int[2];
                answer[0] = 1;
                answer[1] = 2;
            }
            else if (correctNum[2] > correctNum[0]) {
                answer = new int[1];
                answer[0] = 3;
            }
            else {
                answer = new int[3];
                answer[0] = 1;
                answer[1] = 2;
                answer[2] = 3;
            }
        }

       return answer;
    }
}
