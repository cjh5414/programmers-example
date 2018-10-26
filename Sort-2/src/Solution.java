import java.util.Arrays;

/**
 * Created by jihun on 2018. 10. 26..
 */
class Solution {
    public String solution(int[] numbers) {
        String[] str_nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            str_nums[i] = Integer.toString(numbers[i]);

        Arrays.sort(str_nums, (String o1, String o2) -> Integer.parseInt(o2 + o1) - Integer.parseInt(o1 + o2));

        StringBuilder sb = new StringBuilder();
        for (String str : str_nums)
            sb.append(str);

        String answer = sb.toString();
        try {
            if (Integer.parseInt(answer) == 0) return "0";
        } catch(NumberFormatException e) {
        }

        return answer;
    }
}