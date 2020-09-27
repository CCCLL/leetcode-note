package answer;

public class LeetCode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null) return head;
        int len=0;
        ListNode q=head;
        //因有可能要求右转的会超过链表长度，所以先计算链表长度
        while (q!=null){
            q=q.next;
            len++;
        }
        //抛去右转一周复原的情况，求出真正要右转的数
        int n=k%len;
        if (n==0) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode p=dummy;
        q=dummy;
        while (n-->0){
            q=q.next;
        }
        //找到需右转的前一个
        while (q.next!=null){
            p=p.next;
            q=q.next;
        }
        //报需要右转的替换到前面
        ListNode tmp=p.next;
        p.next=q.next;
        q.next=dummy.next;
        dummy.next=tmp;
        return dummy.next;

    }
}
