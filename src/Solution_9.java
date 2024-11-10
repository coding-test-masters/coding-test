class Solution_9 {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    int reversed = 0;
    int temp = x;

    while (temp != 0) {
      int num = temp % 10;
      reversed = reversed * 10 + num;
      temp /= 10;
    }

    return reversed == x;
  }
}