import java.util.*;

public class Gyuri_26 {
  public static int removeDuplicates(int[] nums) {
    List<Integer> list = new ArrayList<>();

    for (int n : nums) {
      if (list.indexOf(n) < 0) {
        list.add(n);
      }
    }

    for (int i = 0; i < list.size(); i++) {
      nums[i] = list.get(i);
    }

    return list.size();
  }

  public static void main(String[] args) {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    System.out.println(removeDuplicates(nums));
  }
}
