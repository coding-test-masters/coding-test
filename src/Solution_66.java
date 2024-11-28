import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution_66 {

  public int[] plusOne(int[] digits) {

    List<Integer> list = new ArrayList<>(Arrays.stream(digits).boxed().toList());

    list.set(list.size() - 1, list.get(list.size() - 1) + 1);
    for (int i = list.size() - 1; i > 0; i--) {
      if (list.get(i) == 10) {
        list.set(i, 0);
        list.set(i - 1, list.get(i - 1) + 1);
      }
    }

    if (list.get(0) == 10) {
      list.set(0, 0);
      list.add(0, 1);
    }

    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}