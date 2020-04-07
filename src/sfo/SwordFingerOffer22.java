package sfo;

import answer.ListNode;

public class SwordFingerOffer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p=head;
        while (k>1){
            head=head.next;
            k--;
        }
        while (head.next!=null){
            head=head.next;
            p=p.next;
        }
        return p;
    }
}
