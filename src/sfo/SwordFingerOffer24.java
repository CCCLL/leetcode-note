package sfo;

import answer.ListNode;

import java.util.List;

public class SwordFingerOffer24 {
    public ListNode reverseList(ListNode head) {
        ListNode p=null;
        ListNode c=head;
        ListNode q=null;
        while (c!=null){
            q=c.next;
            c.next=p;
            p=c;
            c=q;
        }
        return p;
    }
}
