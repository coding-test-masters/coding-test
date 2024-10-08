class Solution_27 {

  public int removeElement(int[] nums, int val) {

    int start = 0;
    int end = nums.length;

    while (start < end) {
      if (nums[start] == val) {
        end--;
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
      } else {
        start++;
      }
    }

    return end;
  }
}