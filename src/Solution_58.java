class Solution_58 {
  public int lengthOfLastWord(String s) {

    s = s.trim();
    String[] splits = s.split(" ");

    return splits[splits.length - 1].length();
  }
}