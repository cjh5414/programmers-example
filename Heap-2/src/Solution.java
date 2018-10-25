import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by jihun on 2018. 10. 24..
 */
class Solution {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int count = 0;
        int date_idx = 0;
        for (int i = 1; i <= k; i++) {
            if (stock == 0) {
                stock += q.remove();
                count++;
            }

            if (date_idx < dates.length && i == dates[date_idx]) {
                q.add(supplies[date_idx]);
                date_idx++;
            }

            stock--;
        }

        return count;
    }
}
