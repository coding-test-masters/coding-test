class Solution_35 {
  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      int num = nums[mid];

      if (num == target) {
        return mid;
      } else if (target < num) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }
}