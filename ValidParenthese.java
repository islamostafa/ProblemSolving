import java.util.Stack;
/**
 * Problem: https://leetcode.com/problems/valid-parentheses/
 * Difficulty: Easy
 */
public class ValidParenthese {

    public boolean isValid(String s) {
// Quick check - if odd length, return false!
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();

        for  (char parenthese : s.toCharArray() ) {
            if (parenthese == '(' || parenthese == '['|| parenthese == '{') {
                stack.push(parenthese);
            } else {
                if (stack.isEmpty())  return false;
                char top = stack.pop();
                if (parenthese ==')' && top != '(') return false;
                if (parenthese == ']' && top != '[') return false;
                if (parenthese == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}
