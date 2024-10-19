import java.util.HashMap;
import java.util.Map;

public class Solution_1 {

  public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();
    int[] result = new int[2];

    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];

      if (!map.containsKey(diff)) {
        map.put(nums[i], i);
      } else {
        result[0] = i;
        result[1] = map.get(diff);
      }
    }

    return result;
  }
}