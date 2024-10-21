import java.util.HashSet;
import java.util.Set;

public class Solution_141 {

  public boolean hasCycle(ListNode head) {

    Set<ListNode> set = new HashSet<>();
    ListNode cur = head;
    while (cur != null) {
      if (!set.contains(cur)) {
        set.add(cur);
      } else {
        return true;
      }

      cur = cur.next;
    }

    return false;
  }

  class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {

      val = x;
      next = null;
    }
  }
}