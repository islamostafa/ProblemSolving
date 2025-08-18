/**
 * Problem: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * Difficulty: Medium
 */

public class twoSum {

    public int[] twoSum(int[] numbers, int target) {

        if (numbers == null || numbers.length < 2) {
            return new int[] {-1, -1};
        }
        int[] result = new int[2];
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer < rightPointer) {
            int currentSum = numbers[leftPointer] + numbers[rightPointer];
            if (currentSum == target) {
                result[0] = leftPointer + 1;
                result[1] = rightPointer + 1;
                return result;
            } else if (currentSum < target) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return result;
    }
}
