public class Solution83 {
    // #83
    // Given the head of a sorted linked list,
    // delete all duplicates such that each element appears only once.
    // Return the linked list sorted as well.
    public ListNode deleteDuplicates(ListNode head) {
        //base case
        if(head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val? head.next : head;
    }
}
