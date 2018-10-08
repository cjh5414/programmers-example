import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jihun on 2018. 10. 9..
 */
class SolutionTest {
    Solution s;

    @BeforeEach
    void setUp() {
        s = new Solution();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void solution() {
        assertEquals(2, s.solution("(())"));
        assertEquals(17, s.solution("()(((()())(())()))(())"));
    }
}