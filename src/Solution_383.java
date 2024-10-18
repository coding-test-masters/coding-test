import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution_383 {
  public boolean canConstruct(String ransomNote, String magazine) {

    Map<Character, Integer> p = new HashMap<>();
    Map<Character, Integer> q = new HashMap<>();

    for (char c : ransomNote.toCharArray()) {
      p.put(c, p.getOrDefault(c, 0) + 1);
    }

    for (char c : ransomNote.toCharArray()) {
      q.put(c, q.getOrDefault(c, 0) + 1);
    }

    for (Entry<Character, Integer> entry : p.entrySet()) {
      if (entry.getValue() > q.getOrDefault(entry.getKey(), 0)) {
        return false;
      }
    }

    return true;
  }
}