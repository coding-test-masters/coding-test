import java.util.*;

public class Gyuri_228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            int end = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == end + 1) {
                    end = nums[j];
                    i = j;
                } else {
                    break;
                }
            }

            if (start == end) {
                list.add("" + start);
            } else {
                list.add("" + start + "->" + end);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums));
    }
}
