public class SingleNumber {
    /**
     * Problem: https://leetcode.com/problems/single-number
     * Difficulty: Easy
     */


    public int singleNumber(int[] array) {
        int result = 0;
        for (int num : array) {statu
            result ^= num;
        }
        return result;
    }
}
