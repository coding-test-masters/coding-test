import java.util.*;

public class Gyuri_205 {
  public static boolean isIsomorphic(String s, String t) {
    Map<Character, Character> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char sc = s.charAt(i);
      char tc = t.charAt(i);

      if (!map.containsKey(sc)) {
        boolean isOk = true;

        for (Map.Entry<Character, Character> entry : map.entrySet()) {
          if (entry.getValue() == tc) {
            isOk = false;
          }
        }

        if (isOk) {
          map.put(sc, tc);
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (map.containsKey(c)) {
        sb.append(map.get(c));
      } else {
        return false;
      }
    }

    if (sb.toString().equals(t)) {
      return true;
    }

    return false;
  }

  public boolean isIsomorphic2(String s, String t) {
    HashMap<Character, Integer> charIndexS = new HashMap<>();
    HashMap<Character, Integer> charIndexT = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if (!charIndexS.containsKey(s.charAt(i))) {
        charIndexS.put(s.charAt(i), i);
      }

       if (!charIndexT.containsKey(t.charAt(i))) {
        charIndexT.put(t.charAt(i), i);
      }

      if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
        return false;
      }
    }

    return true;
  }

  public boolean isIsomorphic3(String s, String t) {
    HashMap<Character, Character> charMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char sc = s.charAt(i);
      char tc = t.charAt(i);

      if (charMap.containsKey(sc)) {
        if (charMap.get(sc) != tc) {
          return false;
        }
      } else if (charMap.containsValue(tc)) {
        return false;
      }

      charMap.put(sc, tc);
    }

    return true;
  }

  public static void main(String[] args) {
    String s = "badc";
    String t = "baba";
    System.out.println(isIsomorphic(s, t));
  }
}
