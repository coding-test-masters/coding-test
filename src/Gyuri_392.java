public class Gyuri_392 {
  public static boolean isSubsequence(String s, String t) {
    int count = 0;
    int idx = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      for (int j = idx; j < t.length(); j++) {
        if (t.charAt(j) == c) {
          idx = j + 1;
          count++;
          break;
        }
      }
    }

    if (count == s.length()) {
      return true;
    } else {
      return false;
    }
  }

  // 투 포인터
  public static boolean isSubsequence2(String s, String t) {
    int sp = 0;
    int tp = 0;

    while (sp < s.length() && tp < t.length()) {
      if (s.charAt(sp) == t.charAt(tp)) {
        sp++;
      }
      tp++;
    }

    return sp == s.length();
  }

  public static void main(String[] args) {
    String s = "acb";
    String t = "ahbgdc";
    System.out.println(isSubsequence(s, t));
    System.out.println(isSubsequence2(s, t));
  }
}
