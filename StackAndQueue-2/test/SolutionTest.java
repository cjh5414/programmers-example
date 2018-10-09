import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 9..
 */
class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[] test1 = {2, 1, 3, 2};
        assertEquals(1, s.solution(test1, 2));

        int[] test2 = {1, 1, 9, 1, 1, 1};
        assertEquals(5, s.solution(test2, 0));
    }
}