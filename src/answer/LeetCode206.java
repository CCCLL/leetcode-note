package answer;



public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        if (head==null)
            return null;
        ListNode p=null;
        ListNode q=head.next;
        while (q!=null){
            head.next=p;
            p=head;
            head=q;
            q=q.next;
        }
        head.next=p;
        return head;


    }
}
