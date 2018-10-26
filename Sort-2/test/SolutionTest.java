import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 25..
 */

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[] numbers = {3, 30, 34, 5, 9};
        assertEquals("9534330", s.solution(numbers));
    }
}