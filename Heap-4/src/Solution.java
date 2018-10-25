import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by jihun on 2018. 10. 24..
 */
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        int size = 0;

        for (String op : operations) {
            String[] cmd = op.split(" ");
            if (cmd[0].equals("I")) {
                maxQ.add(Integer.parseInt(cmd[1]));
                minQ.add(Integer.parseInt(cmd[1]));
                size++;
            }
            else if (size != 0) {
                if (Integer.parseInt(cmd[1]) == 1) {
                    minQ.remove(maxQ.remove());
                    size--;
                } else {
                    maxQ.remove(minQ.remove());
                    size--;
                }
            }
        }

        int[] answer = new int[2];

        if (size == 1)
            answer[0] = answer[1] = maxQ.remove();
        else if (size != 0) {
            answer[0] = maxQ.remove();
            answer[1] = minQ.remove();
        }

        return answer;
    }
}
