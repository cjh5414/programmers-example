/**
 * Created by jihun on 2018. 10. 6..
 */
public class Solution {
    public static boolean solution(String[] phone_book) {
        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                int lenI = phone_book[i].length();
                int lenJ = phone_book[j].length();

                if (lenI < lenJ && phone_book[i].equals(phone_book[j].substring(0, lenI)))
                    return false;
                else if (lenI > lenJ && phone_book[j].equals(phone_book[i].substring(0, lenJ)))
                    return false;
                else if (lenI == lenJ && phone_book[i].equals(phone_book[j]))
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] phone_nums = {"911", "97625999", "91125426"};
        System.out.println(solution(phone_nums));
    }
}
