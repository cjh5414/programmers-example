import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 22..
 */
class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[] scoville = {12, 2, 10, 9, 3, 1};
        assertEquals(2, s.solution(scoville, 7));
    }
}