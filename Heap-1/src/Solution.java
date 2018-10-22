import java.util.PriorityQueue;

/**
 * Created by jihun on 2018. 10. 22..
 */
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        int count = 0;

        for (int val : scoville)
            q.add(val);

        while (!q.isEmpty()) {
            int first = q.remove();
            if (first >= K) break;
            if (q.size() == 0) return -1;
            int second = q.remove();
            q.add(first + second * 2);
            count++;
        }

        return count;
    }
}
