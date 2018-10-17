import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 17..
 */
class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[] arr = {498, 501, 470, 489};
        int[] answer = {2, 1, 1, 0};
        assertEquals(answer, s.solution(arr));
    }
}