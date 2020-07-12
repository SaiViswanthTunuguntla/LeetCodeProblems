package LinkedlIst;
//    public class ListNode {
//        int val;
//        LinkedlIst.ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, LinkedlIst.ListNode next) { this.val = val; this.next = next; }
//    }
public class RemoveNthFromEnd {
    //more intuitive soln..my approach but not that effective..two iterations
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        ListNode prev=null;
        int counter=1;
        while(curr.next!=null)
        {
            prev=curr;
            curr=curr.next;
            counter++;
        }
        int newCounter=1;
        curr=head;
        prev=null;
        while(curr.next!=null)
        {
            if(newCounter!=counter-n)
            { prev=curr;
                curr=curr.next;
                newCounter++;
            }
            else{
                curr.next=curr.next.next;
                break;
            }
        }
        return head;
    }
    public ListNode removeNthFromEndApproch2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;

        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        ListNode sec = dummy;
        while (first.next != null) {
            first = first.next;
            sec = sec.next;
        }

        sec.next = sec.next.next;

        return dummy.next;

    }


}

// * Definition for singly-linked list.

