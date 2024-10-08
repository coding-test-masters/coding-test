public class Mark_27 {
  public static void main(String[] args) {

    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    int val = 2;

    System.out.println(new Mark_27().removeElement(nums, val));
  }

  //시간 복잡도 (O(n)) 공간 복잡도 (O(1))
  public int removeElement(int[] nums, int val) {
    int p1 = 0;
    int i = 0;

    while(i < nums.length) {
      if(nums[i++] != val) {
        nums[p1++] = nums[i - 1];
      }
    }

    return p1;
  }
}