package answer;

public class LeetCode82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) return null;
        ListNode dummy=new ListNode(Integer.MAX_VALUE);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode l=head;
        ListNode r=l.next;

        while (r!=null){
            if (l.val==r.val){
                r=r.next;
            }else {
                if (l.next==r){
                    pre=pre.next;
                }else {
                    pre.next=r;
                }
                l=r;
                r=l.next;
            }
        }
        //考虑链表的最后一部分是重复的
        if (l.next!=null) pre.next=null;
        return  dummy.next;
    }
}
