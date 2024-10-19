import java.util.HashMap;
import java.util.Map;

public class Solution_290 {

  public boolean wordPattern(String pattern, String s) {

    Map<String, Character> p = new HashMap<>();
    Map<Character, String> q = new HashMap<>();

    String[] sArr = s.split(" ");
    if (pattern.length() != sArr.length) {
      return false;
    }

    for (int i = 0; i < sArr.length; i++) {
      char c = pattern.charAt(i);
      String word = sArr[i];

      if (!p.containsKey(word)) {
        p.put(word, c);
      } else if (!p.get(word).equals(c)) {
        return false;
      }

      if (!q.containsKey(c)) {
        q.put(c, word);
      } else if (!q.get(c).equals(word)) {
        return false;
      }
    }

    return true;
  }
}