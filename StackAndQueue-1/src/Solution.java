import java.util.Stack;

/**
 * Created by jihun on 2018. 10. 9..
 */
public class Solution {
    public int solution(String arrangement) {
        Stack<Character> s = new Stack<>();
        char pre = 0;
        int count = 0;

        for (char c : arrangement.toCharArray()) {
            if (c == '(') s.push(c);
            else {
                s.pop();
                if (pre == '(') count += s.size();
                else count += 1;
            }
            pre = c;
        }
        return count;
    }
}
