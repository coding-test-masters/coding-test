public class Marcel_27 {

  public static void main(String[] args) {
    //Input: nums = [3,2,2,3], val = 3
    int[] nums = {3,2,2,3};
    int val = 3;

    int result = new Solution().removeElement(nums, val);
    System.out.println("k = " + result);
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  static class Solution {
    public int removeElement(int[] nums, int val) {
      int l = 0;
      int r = nums.length - 1;

      while (l <= r) {
        while (nums[l] != val && l <= r) {
          l++;
        }
        while (nums[r] == val && l <= r) {
          r--;
        }

        if (l >= r) {
          break;
        }

        // swap
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
      }

      return l;
    }
  }
}
