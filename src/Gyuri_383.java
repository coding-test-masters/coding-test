import java.util.*;

public class Gyuri_383 {
  public static boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> map = new HashMap<>();

    for (char c : magazine.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (char c : ransomNote.toCharArray()) {
      if (map.containsKey(c)) {
        int val = map.get(c);
        if (val > 1) {
          map.put(c, map.get(c) - 1);
        } else {
          map.remove(c);
        }
      } else {
        return false;
      }
    }

    return true;
  }

  public static boolean canConstruct2(String ransomNote, String magazine) {
    Map<Character, Integer> map = new HashMap<>();

    for (char c : magazine.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (char c : ransomNote.toCharArray()) {
      if (!map.containsKey(c) || map.get(c) <= 0) {
        return false;
      }
      map.put(c, map.get(c) - 1);
    }

    return true;
  }

  public static void main(String[] args) {
    String ransomNote = "aa";
    String magazine = "ab";
    System.out.println(canConstruct2(ransomNote, magazine));

    magazine = "aab";
    System.out.println(canConstruct2(ransomNote, magazine));
  }
}
