import java.util.*;
import java.util.Map.*;

public class Gyuri_169 {
  public static int majorityElement(int[] nums) {
    int len = (nums.length % 2 == 0) ? nums.length / 2 : nums.length / 2 + 1;
    Map<Integer, Integer> map = new HashMap<>();

    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }

    for (Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() >= len) {
        return entry.getKey();
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    int[] nums = {2, 2, 1, 1, 1, 2, 2};
    System.out.println(majorityElement(nums));
  }
}
