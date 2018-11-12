import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jihun on 2018. 10. 12..
 */
class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[][] balls = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};

        assertEquals(2, s.solution(balls));
    }
}