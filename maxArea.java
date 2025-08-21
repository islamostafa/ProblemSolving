/**
 * Problem: https://leetcode.com/problems/container-with-most-water/
 * Difficulty: Medium
 */
public class maxArea {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        // More concise solution more optimized
//        Calculate area directly using Math.min
//        maxArea = Math.max(maxArea,
//                (rightPointer - leftPointer) *
//                        Math.min(height[leftPointer], height[rightPointer]));
//
//        // Move pointers
//        if (height[leftPointer] < height[rightPointer]) {
//            leftPointer++;
//        } else {
//            rightPointer--;
//        }

        // My solution
        while (leftPointer < rightPointer) {
            int lowestWall = 0;
            int width = rightPointer - leftPointer;
            if (height[leftPointer] < height[rightPointer]) {
                lowestWall = height[leftPointer];
                leftPointer++;
            } else {
                lowestWall = height[rightPointer];
                rightPointer--;
            }

            int currentArea = width * lowestWall;
            if (currentArea > maxArea) {
                maxArea = currentArea;

            }

        }
        return maxArea;
    }
}
