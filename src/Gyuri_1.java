import java.util.*;

public class Gyuri_1 {
  public static int[] twoSum(int[] nums, int target) {
    int[] answer = new int[2];

    for (int i = 0; i < nums.length; i++) {
      int cur = nums[i];

      for (int j = i + 1; j < nums.length; j++) {
        if (cur + nums[j] == target) {
          answer[0] = i;
          answer[1] = j;
        }
      }

    }

    return answer;
  }

  public static int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int remain = target - nums[i];

      if (map.containsKey(remain)) {
        return new int[]{map.get(remain), i};
      }

      map.put(nums[i], i);
    }

    return new int[]{};
  }

    public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    System.out.println(Arrays.toString(twoSum2(nums, target)));
  }
}