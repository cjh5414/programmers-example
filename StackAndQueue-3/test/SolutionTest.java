import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 11..
 */
class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        int[] array = {7, 4, 5 ,6};
        assertEquals(8, s.solution(2, 10, array));

        int[] array2 = {10};
        assertEquals(101, s.solution(100, 100, array2));

        int[] array3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        assertEquals(110, s.solution(100, 100, array3));
    }
}