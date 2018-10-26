import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 26..
 */
class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[] citations = {3, 0, 6, 1, 5};
        assertEquals(3, s.solution(citations));
    }
}