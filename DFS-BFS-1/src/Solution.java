/**
 * Created by jihun on 2018. 11. 14..
 */
class Solution {
    int target;
    int[] numbers;

    public int solution(int[] numbers, int target) {
        this.target = target;
        this.numbers = numbers;
        return dfs(0, 0);
    }

    public int dfs(int idx, int num) {
        if (idx == numbers.length) {
            if (target == num) return 1;
            else return 0;
        }

        return dfs(idx + 1, num + numbers[idx]) + dfs(idx + 1, num - numbers[idx]);
    }
}
