import java.util.HashMap;

/**
 * Created by jihun on 2018. 10. 7..
 */
public class Solution {
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String key = cloth[1];
            map.put(key, map.getOrDefault(key, 1) + 1);
        }

        int count = 1;

        for (String key : map.keySet())
            count *= map.get(key);

        return count - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
}
