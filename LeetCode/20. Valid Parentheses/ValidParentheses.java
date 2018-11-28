import java.util.*;

/* 
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

*/
class ValidParentheses {
    private Map<Character, Character> map; // Create map for opening and closing tags

    public ValidParentheses() {
        map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
    }

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (isOpeningTerm(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !isValid(c, stack.pop())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpeningTerm(Character c) {
        return map.containsKey(c);
    }

    private boolean isValid(Character closingTerm, Character openTerm) {
        if (map.get(openTerm) == closingTerm) {
            return true;
        }
        return false;
    }
}