package Q2;

import java.util.Arrays;

class Solution {
    public int solution(int l, int[] v) {
        Arrays.sort(v);

        int maxDiff = -1;
        int diff;
        int answer = 0;

        for (int i = 0; i < v.length - 1; i++) {
            diff = v[i + 1] - v[i];
            if (diff > maxDiff) maxDiff = diff;
        }

        if (maxDiff % 2 != 0) maxDiff++;
        answer = maxDiff / 2;

        if (v[0] > answer) answer = v[0];
        if (l - v[v.length - 1] > answer) answer = l - v[v.length - 1];

        return answer;
    }
}
