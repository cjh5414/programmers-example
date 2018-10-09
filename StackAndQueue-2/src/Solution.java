import java.util.*;

/**
 * Created by jihun on 2018. 10. 9..
 */

public class Solution {
    public int solution(int[] priorities, int location) {
        ArrayList<Integer> sortedList = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        LinkedList<Boolean> targetQueue = new LinkedList<>();

        int order = 1;
        int target = priorities[location];

        for (int i = 0; i < priorities.length; i++) {
            if (i == location)
                targetQueue.add(true);
            else if (priorities[i] == target)
                targetQueue.add(false);
            queue.add(priorities[i]);
            sortedList.add(priorities[i]);
        }

        Collections.sort(sortedList);
        Collections.reverse(sortedList);

        for (Integer i : sortedList) {
            if (i == target) {
                while (!targetQueue.remove())
                    order += 1;
                return order;
            }

            while (true) {
                int tmp = queue.remove();

                if (tmp == i) break;
                else if (tmp == target)
                    targetQueue.add(targetQueue.remove());
                queue.add(tmp);
            }

            order += 1;
        }

        return -1;
    }
}
