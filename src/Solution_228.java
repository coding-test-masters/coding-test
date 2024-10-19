import java.util.ArrayList;
import java.util.List;

public class Solution_228 {

  public List<String> summaryRanges(int[] nums) {

    int start, end;
    List<String> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int cur = nums[i];
      start = i;
      end = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (cur + 1 == nums[j]) {
          end = j;
          cur = nums[j];
        } else {
          break;
        }
      }

      if (start != end) {
        result.add(nums[start] + "->" + nums[end]);
        i = end;
      } else {
        result.add(nums[start] + "");
      }
    }

    return result;
  }
}