public class Gyuri_21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        if (list1 == null) {
            return list2;
        }

        return list1;
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode runner = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                runner.next = list1;
                list1 = list1.next;
            } else {
                runner.next = list2;
                list2 = list2.next;
            }

            runner = runner.next;
        }

        if (list1 != null) {
            runner.next = list1;
        }

        if (list2 != null) {
            runner.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.println(mergeTwoLists2(list1, list2));
    }
}
