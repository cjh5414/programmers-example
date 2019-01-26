package Q1;

import java.util.ArrayList;

class Solution {
    public boolean solution(int[] arrA, int[] arrB) {
        int len = arrA.length;
        if (len != arrB.length) return false;

        ArrayList<Integer> options = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (arrB[i] == arrA[0]) {
                options.add(i);
            }
        }

        if (options.size() == 0) return false;

        for (int i = 0; i < options.size(); i++) {
            int ib = options.get(i);
            boolean isSame = true;
            for (int a : arrA) {
                if (arrB[ib] != a) isSame = false;
                ib = (ib + 1) % len;
            }
            if (isSame) return true;
        }

        return false;
    }
}
