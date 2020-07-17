package LinkedlIst;

public class ReverseLinkedList {
    //TC:O(n),SC: O(1)
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr= head;
        ListNode next= null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
