public class RemoveDuplicatesFromSortedList_83 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        RemoveDuplicatesFromSortedList_83 solution = new RemoveDuplicatesFromSortedList_83();
        ListNode result = solution.deleteDuplicates(head);
        printList(result);
    }
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(head.val);
        ListNode ptr = head.next;
        ListNode ans = dummy;
        while(ptr != null){
            if(ptr.val != dummy.val){
                dummy.next = ptr;
                dummy = dummy.next;
            }
            ptr = ptr.next;
        }
        dummy.next = null;
        return ans;
        
    }
}
