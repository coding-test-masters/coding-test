import java.util.*;

public class Gyuri_14 {
  public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);

      for (String str : strs) {
        if (str.length() <= i || c != str.charAt(i)) {
          return sb.toString();
        }
      }

      sb.append(c);
    }

    return sb.toString();
  }

  public static String longestCommonPrefix2(String[] strs) {
    Arrays.sort(strs);

    String first = strs[0];
    String last = strs[strs.length - 1];

    int c = 0;

    while (c < first.length()) {
      if (first.charAt(c) == last.charAt(c)) {
        c++;
      } else {
        break;
      }
    }

    return c == 0 ? "" : first.substring(0, c);
  }

  public static void main(String[] args) {
    String[] strs = {"flower", "flow", "flight"};

    System.out.println(longestCommonPrefix(strs));
    System.out.println(longestCommonPrefix2(strs));
  }
}
