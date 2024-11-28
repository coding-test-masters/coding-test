public class Solution_45 {
  public int jump(int[] nums) {
    int jumps = 0;
    int end = 0;
    int max = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      max = Math.max(max, i + nums[i]);

      if (i == end) {
        jumps++;
        end = max;
      }
    }

    return jumps;
  }
}