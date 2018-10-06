import java.util.HashMap;

/**
 * Created by jihun on 2018. 10. 6..
 */
public class Solution {
    static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hash = new HashMap<>();

        for (String s : completion) {
            int count = 1;
            if (hash.containsKey(s)) count += hash.get(s);
            hash.put(s, count);
        }

        for (String s : participant) {
            if (!hash.containsKey(s)) return s;
            int count = hash.get(s);
            if (count == 0) return s;
            hash.put(s, count - 1);
        }

        return null;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String result = solution(participant, completion);
        System.out.println(result);
    }
}
