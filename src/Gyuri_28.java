public class Gyuri_28 {
  public static int strStr(String haystack, String needle) {
    if (!haystack.contains(needle)) {
      return -1;
    }

    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
      if (haystack.substring(i, i + needle.length()).equals(needle)) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    String haystack = "abc";
    String needle = "c";

    System.out.println(strStr(haystack, needle));
  }
}
