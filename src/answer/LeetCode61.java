package answer;

public class LeetCode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null) return head;
        int len=0;
        ListNode q=head;
        while (q!=null){
            q=q.next;
            len++;
        }
        int n=k%len;
        if (n==0) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode p=dummy;
        q=dummy;
        while (n-->0){
            q=q.next;
        }
        while (q.next!=null){
            p=p.next;
            q=q.next;
        }
        ListNode tmp=p.next;
        p.next=q.next;
        q.next=dummy.next;
        dummy.next=tmp;
        return dummy.next;

    }
}
