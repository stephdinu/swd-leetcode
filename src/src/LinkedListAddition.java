class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LinkedListAddition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode current = prehead;
        int rest = 0; //keep track of rest

        while(l1 != null || l2 != null || rest == 1) {
            int sum = 0; //keep track of sum at node i
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += rest;
            rest = sum/10;
            ListNode node = new ListNode(sum % 10);
            current.next = node;
            current = current.next;
        }
        return prehead.next;
    }
}
