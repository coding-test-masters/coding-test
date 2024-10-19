import java.util.Map;
import java.util.Stack;

public class Solution_20 {

  public boolean isValid(String s) {

    Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
    Stack<Character> stack = new Stack<>();
    char[] cArr = s.toCharArray();

    for (char c : cArr) {
      if (stack.isEmpty()) {
        stack.push(c);
      } else {
        char top = stack.peek();
        if (map.containsKey(top) && map.get(top) == c) {
          stack.pop();
        } else {
          if (map.containsKey(c)) {
            stack.push(c);
          } else {
            return false;
          }
        }
      }
    }

    return stack.isEmpty();
  }
}