import java.util.*;

public class Gyuri_141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        ListNode node = head;
        while (node != null && !set.contains(node)) {
            set.add(node);
            node = node.next;
        }

        return node != null;
    }

    public boolean hasCycle2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return false;
        }

        return true;
    }
}
