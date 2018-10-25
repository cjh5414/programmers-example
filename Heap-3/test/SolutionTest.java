import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 25..
 */
class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[][] arr = {{0, 3}, {1, 9}, {2, 6}};

        assertEquals(9, s.solution(arr));
    }
}