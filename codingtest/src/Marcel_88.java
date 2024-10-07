public class Marcel_88 {

  public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0};
    int m = 3;
    int[] nums2 = {2,5,6};
    int n = 3;

    new Solution().merge(nums1, m, nums2, n);
    for (int num : nums1) {
      System.out.print(num + " ");
    }
  }

  static class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int cur = m + n - 1;
      m--;
      n--;

      while (m >= 0 && n >= 0) {
        // 둘을 비교해서 최종 자리에 놓음
        if (nums1[m] <= nums2[n]) {
          nums1[cur] = nums2[n];
          n--;
        } else {
          nums1[cur] = nums1[m];
          m--;
        }
        cur--;

        System.out.println("m, n = " + m + "," + n);
      }

      while (n >= 0) {
        nums1[cur] = nums2[n];
        n--;
        cur--;
      }
    }
  }
}
