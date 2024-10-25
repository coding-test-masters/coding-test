import java.util.HashMap;
import java.util.Map;

public class Gyuri_13 {
  static final String[] special = {"CM", "CD", "XC", "XL", "IX", "IV"};
  static final int[] value1 = {900, 400, 90, 40, 9, 4};

  static final String[] normal = {"M", "D", "C", "L", "X", "V", "I"};
  static final int[] value2 = {1000, 500, 100, 50, 10, 5, 1};

  public static int romanToInt1(String s) {
    int cal = 0;

    for (int i = 0; i < special.length; i++) {
      if (s.contains(special[i])) {
        s = s.replace(special[i], "");
        cal += value1[i];
      }
    }

    if (!s.isEmpty()) {
      for (char c : s.toCharArray()) {
        for (int i = 0; i < normal.length; i++) {
          if ((c + "").equals(normal[i])) {
            cal += value2[i];
          }
        }
      }
    }

    return cal;
  }

  public static int romanToInt2(String s) {
    Map<Character, Integer> map = new HashMap<>();

    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int cal = 0;

    for (int i = 0; i < s.length(); i++) {
      if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
        cal -= map.get(s.charAt(i));
      } else {
        cal += map.get(s.charAt(i));
      }
    }

    return cal;
  }

  public static void main(String[] args) {
    String s = "MCMXCIV";
    System.out.println(romanToInt1(s));
    System.out.println(romanToInt2(s));
  }
}
