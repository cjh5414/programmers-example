/**
 * Created by jihun on 2018. 11. 11..
 */

class Solution {
    int[] numsCount = new int[10];

    void setNumsCount(String numbers) {
        for (char num : numbers.toCharArray()) {
            numsCount[Character.getNumericValue(num)]++;
        }
    }

    public int solution(String numbers) {
        int count = 0;

        setNumsCount(numbers);

        for (int i = 2; i < Math.pow(10, numbers.length()); i++) {
            if (isIncluded(i) && isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    boolean isIncluded(int num) {
       int[] numSet = new int[10];

       for (char c : Integer.toString(num).toCharArray())
           numSet[Character.getNumericValue(c)]++;

       for (int i = 0; i < 10; i++) {
           if (numSet[i] > numsCount[i])
               return false;
       }

       return true;
    }
}