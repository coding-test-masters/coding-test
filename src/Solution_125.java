public class Solution_125 {

  public boolean isPalindrome(String s) {

    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        sb.append(Character.toLowerCase(c));
      }
    }

    if (sb.isEmpty()) {
      return true;
    }

    for (int i = 0; i <= sb.length() / 2; i++) {
      int last = sb.length() - i - 1;
      if (sb.charAt(i) != sb.charAt(last)) {
        return false;
      }
    }

    return true;
  }
}