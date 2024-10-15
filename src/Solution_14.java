public class Solution_14 {
  public String longestCommonPrefix(String[] strs) {

    StringBuilder sb = new StringBuilder();
    int index = 0;

    while (true) {
      Character c = null;

      for (String str : strs) {
        if (index < str.length()) {
          if (c == null) {
            c = str.charAt(index);
          } else {
            if (c != str.charAt(index)) {
              return sb.toString();
            }
          }
        } else {
          return sb.toString();
        }
      }

      sb.append(c);
      index++;
    }

  }
}