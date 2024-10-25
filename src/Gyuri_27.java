import java.util.*;

public class Gyuri_27 {
    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();

        for (int n : nums) {
            if (n != val) {
                list.add(n);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        System.out.println(removeElement(nums, val));
    }

//    public static int removeElement(int[] nums, int val) {
//        if (nums.length == 0) {
//            return 0;
//        }
//
//        int n = nums.length - 1;
//
//        while (nums[n] == val) {
//            n--;
//
//            if (n < 0) {
//                return 0;
//            }
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (i == n) {
//                break;
//            }
//
//            if (nums[i] == val) {
//                nums[i] = nums[n];
//                nums[n] = val;
//                n--;
//
//                while (nums[n] == val) {
//                    n--;
//                }
//            }
//        }
//
//        return n + 1;
//    }
}
