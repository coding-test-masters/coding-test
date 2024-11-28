class Solution_69 {
  public int mySqrt(int x) {
    if (x == 0) {
      return x;
    }

    int left = 1;
    int right = x;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (mid * mid == x) {
        return mid;
      } else if (mid * mid > x) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }
}