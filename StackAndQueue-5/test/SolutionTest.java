import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 13..
 */
class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[] progresses = {99, 90, 80, 70};
        int[] speeds = {1, 10, 20, 30};
        int[] ret = {4};

        assertEquals(ret, s.solution(progresses, speeds));
    }
}