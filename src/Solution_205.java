import java.util.HashMap;
import java.util.Map;

public class Solution_205 {

  public boolean isIsomorphic(String s, String t) {

    Map<Character, Integer> p = new HashMap<>();
    Map<Character, Integer> q = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if (!p.containsKey(s.charAt(i))) {
        p.put(s.charAt(i), i);
      }

      if (!q.containsKey(t.charAt(i))) {
        q.put(t.charAt(i), i);
      }

      if (!p.get(s.charAt(i)).equals(q.get(t.charAt(i)))) {
        return false;
      }
    }

    return true;
  }
}