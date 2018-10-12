import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 12..
 */
class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[] heights = {6, 9, 5, 7, 4};
        int[] ret = {0, 0, 2, 2, 4};

        assertEquals(ret, s.solution(heights));
    }
}