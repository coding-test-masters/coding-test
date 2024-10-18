public class Solution_392 {

  public boolean isSubsequence(String s, String t) {

    int p = 0;
    int q = 0;

    while (p < s.length() && q < t.length()) {
      if (s.charAt(p) == t.charAt(q)) {
        p++;
      }
      q++;
    }

    return p == s.length();
  }
}