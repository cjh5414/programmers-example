/**
 * Created by jihun on 2018. 10. 24..
 */
class Solution {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;

        for (int i = 0; i < dates.length; i++) {
            if (stock <= dates[i]) {
                stock += supplies[i];
                answer++;
            }
            if (stock >= k) return answer;
        }

        if (stock < k) answer++;
        return answer;
    }
}
