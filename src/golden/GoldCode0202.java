package golden;

import answer.ListNode;

public class GoldCode0202 {
    public int kthToLast(ListNode head, int k) {
        ListNode p=head;
        ListNode q=head;
        while (k-1>0){
            q=q.next;
            k--;
        }
        while (q.next!=null){
            p=p.next;
            q=q.next;
        }
        return p.val;
    }
}
