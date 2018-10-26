import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 25..
 */

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = {5, 6, 3};

        assertArrayEquals(answer, s.solution(array, commands));
    }
}