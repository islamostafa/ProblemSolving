import java.util.HashSet;
/**
 * Problem: https://leetcode.com/problems/contains-duplicate/
 * Difficulty: Easy
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for ( Integer i : nums) {
            if(!set.add(i))  return true;
        }
        return false;
    }
}
