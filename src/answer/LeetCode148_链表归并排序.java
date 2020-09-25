package answer;

public class LeetCode148_链表归并排序 {
    public ListNode sortList(ListNode head) {
        if (head==null||head.next==null) return head;

        //快慢指针需注意
        ListNode s=head;
        ListNode f=head.next;

        while (f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode tmp = s.next;
        s.next=null;
        ListNode l = sortList(head);
        ListNode r = sortList(tmp);
        ListNode res = merge(l, r);
        return res;

    }
    private ListNode merge(ListNode l,ListNode r){

        ListNode dummy=new ListNode(Integer.MIN_VALUE);
        ListNode p=dummy;
        while (l!=null&&r!=null){
            if (l.val<r.val){
                p.next=l;
                l=l.next;
            }else {
                p.next=r;
                r=r.next;
            }
            p=p.next;
        }
        if (l==null){
            p.next=r;
        }else {
            p.next=l;
        }
        return dummy.next;
    }
}
