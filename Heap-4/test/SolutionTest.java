import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 25..
 */

class SolutionTest {
    Solution s = new Solution();

    @Test
    void solution() {
        String[] operation = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333", "D -1", "D -1"};
        int[] answer = {333, 333}   ;

        assertArrayEquals(answer, s.solution(operation));
    }
}