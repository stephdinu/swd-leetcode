import java.util.Stack;
public class Solution20 {
    // #20
    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //Every close bracket has a corresponding open bracket of the same type.
    public boolean isValid(String s) {
        Stack<Character> symbols = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                symbols.push(c);
            }
            else if (c == ')' && !symbols.isEmpty() && symbols.peek() == '(') {
                symbols.pop();
            }
            else if (c == '}' && !symbols.isEmpty() && symbols.peek() == '{') {
                symbols.pop();
            }
            else if (c == ']' && !symbols.isEmpty() && symbols.peek() == '[') {
                symbols.pop();
            }
            else {
                return false;
            }
        }
        return symbols.isEmpty();
    }
}
