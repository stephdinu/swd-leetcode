public class Solution21 {
    // #21
    // You are given the heads of two sorted linked lists, list1 and list2
    // Merge the two lists in a one sorted list. The list should be made by
    // splicing together the nodes of the first two lists.
    // Return the head of the merged linked list.
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);
        ListNode current = prehead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            }
            else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list2 == null) {
            current.next = list1;
        }
        else {
            current.next = list2;
        }

        return prehead.next;

    }
}
