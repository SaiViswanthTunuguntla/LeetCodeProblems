package LinkedlIst;
/**
  Definition for singly-linked list.**/
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class DeleteANode {

    ListNode head;
    public void deleteNode(ListNode node) {
        int key=node.val;
        ListNode prev=null;
        ListNode currNode= head.next;
        if(head.val==key){
            head=head.next;
        }
        else{

            while(currNode.next!=null)
            {
                if(currNode.val==key)
                {
                    prev.next=currNode.next;
                    break;
                }
                else{
                    prev=currNode;
                    currNode=currNode.next;
                }
            }
        }

    }
    //Simplest way possible
    public void deleteNodeApprach2(ListNode node) {
            node.val=node.next.val;
            node.next=node.next.next;
    }

}
