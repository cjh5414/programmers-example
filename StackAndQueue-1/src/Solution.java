import java.util.Stack;

/**
 * Created by jihun on 2018. 10. 9..
 */
public class Solution {
    public int solution(String arrangement) {
        Stack<Integer> s = new Stack<>();
        int count = 0;

        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') s.push(i);
            else {
                if (s.pop() + 1 == i) count += s.size();
                else count += 1;
            }
        }
        return count;
    }
}
