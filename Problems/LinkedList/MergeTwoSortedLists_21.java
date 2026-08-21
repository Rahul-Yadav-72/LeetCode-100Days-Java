class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists_21{
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        MergeTwoSortedLists_21 solution = new MergeTwoSortedLists_21();
        ListNode merged = solution.mergeTwoLists(list1, list2); 
        printList(merged);
    }
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        while (ptr1 != null && ptr2 != null) {
            if(ptr1.val < ptr2.val){
                dummy.next = ptr1;
                ptr1 = ptr1.next;
            }else{
                dummy.next = ptr2;
                ptr2 = ptr2.next;
            }
            dummy = dummy.next;
            
        }
        if(ptr1 != null){
            dummy.next = ptr1;
        }else{
            dummy.next = ptr2;
        }
        return ans.next;
    }
}
 
