/**
 * Created by jihun on 2018. 10. 17..
 */
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < prices.length; j++) {
                if (j == prices.length - 1 || prices[i] >= prices[j]) {
                    answer[i] = count;
                    break;
                }
                else
                    count++;
            }
        }

        return answer;
    }
}
