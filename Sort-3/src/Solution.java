import java.util.Arrays;

/**
 * Created by jihun on 2018. 10. 26..
 */
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations.length - i >= citations[i] && i + 1 <= citations[i])
                return citations[i];
        }

        return -1;
    }
}
