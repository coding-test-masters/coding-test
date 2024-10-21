public class Gyuri_125 {
  public static boolean isPalindrome(String s) {
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (Character.isAlphabetic(c) || Character.isDigit(c)) {
        sb.append(c);
      }
    }

    String s1 = sb.toString().toLowerCase();

    StringBuilder reverse = new StringBuilder();

    for (int i = sb.toString().length() - 1; i >= 0; i--) {
      reverse.append(sb.charAt(i));
    }

    String s2 = reverse.toString().toLowerCase();

    if (s1.equals(s2)) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isPalindrome2(String s) {
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (Character.isAlphabetic(c) || Character.isDigit(c)) {
        sb.append(Character.toLowerCase(c));
      }
    }

    int left = 0;
    int right = sb.toString().length() - 1;

    while (left < right) {
      if (sb.charAt(left) != sb.charAt(right)) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }

  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(s));
  }
}
