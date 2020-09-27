package answer;

public class LeetCode234 {
    public boolean isPalindrome(ListNode head) {
        if (head==null) return true;
        //快慢指针找到中点
        ListNode s=head;
        ListNode f=head;
        while (f.next!=null&&f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }


        ListNode cur=s.next;
        s.next=null;
        //反转后半部分链表
        ListNode pre=null;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        //两个链表挨个比较
        while (pre!=null){
            if (head.val!=pre.val){
                return false;
            }
            head=head.next;
            pre=pre.next;
        }
        return true;
    }
}
