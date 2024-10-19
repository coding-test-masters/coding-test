public class Solution_202 {

  public boolean isHappy(int n) {

    int cur = n;
    for (int i = 0; i < 10; i++) {
      String s = Integer.toString(cur);
      char[] sArr = s.toCharArray();
      int sum = 0;

      for (int j = 0; j < sArr.length; j++) {
        int num = sArr[j] - '0';
        sum += Math.pow(num, 2);
      }

      cur = sum;

      if (cur == 1) {
        return true;
      }
    }

    return false;
  }
}