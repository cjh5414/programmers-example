import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 22..
 */
class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int stock = 4;
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};
        int k = 30;

        assertEquals(2, s.solution(stock, dates, supplies, k));
    }
}