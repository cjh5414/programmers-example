import java.util.ArrayList;

/**
 * Created by jihun on 2018. 10. 11..
 */
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        ArrayList<Integer> bridgeQueue = new ArrayList<>(bridge_length);
        int time = 1;

        for (int i = 0; i < bridge_length - 1; i++)
            bridgeQueue.add(0);
        bridgeQueue.add(truck_weights[0]);
        for (int i = 1; i < truck_weights.length; i++) {
            boolean isFirst = true;
            while (true) {
                int sum = 0;
                for (int j = 0; j < bridgeQueue.size(); j++)
                    sum += bridgeQueue.get(j);

                if (sum + truck_weights[i] <= weight) {
                    bridgeQueue.remove(0);
                    bridgeQueue.add(truck_weights[i]);
                    if (isFirst) time++;
                    break;
                }

                bridgeQueue.remove(0);
                bridgeQueue.add(0);
                time++;
                isFirst = false;
            }
        }

        time += bridge_length;
        return time;
    }
}
