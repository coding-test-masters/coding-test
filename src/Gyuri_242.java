import java.util.*;

public class Gyuri_242 {
  public static boolean isAnagram(String s, String t) {
    Map<Character, Integer> map = new HashMap<>();

    if (s.length() != t.length()) {
      return false;
    }

    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (char c : t.toCharArray()) {
      if (map.containsKey(c) && map.get(c) > 0) {
        map.put(c, map.get(c) - 1);
      } else {
        return false;
      }
    }

    return true;
  }

  public static boolean isAnagram2(String s, String t) {
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();

    Arrays.sort(sArr);
    Arrays.sort(tArr);

    return Arrays.equals(sArr, tArr);
  }

    public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    System.out.println(isAnagram2(s, t));
  }
}