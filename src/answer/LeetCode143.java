package answer;

public class LeetCode143 {
    public static void main(String[] args) {
        new LeetCode143().reorderList(ListNode.getListNode(new int[]{1,2,3,4}));
    }
    public void reorderList(ListNode head) {
        if (head==null||head.next==null) return;
        //找中点，链表分成两个
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHeadIndex = slow.next;
        slow.next = null;
        ListNode newHead=null;

        //后半段反转，头插法
        while (newHeadIndex!=null){
            ListNode tmp=newHeadIndex.next;
            newHeadIndex.next=newHead;
            newHead=newHeadIndex;
            newHeadIndex=tmp;
        }

        //重组
        while (newHead!=null){
            ListNode tmp=newHead.next;
            newHead.next= head.next;
            head.next=newHead;
            head=newHead.next;
            newHead=tmp;
        }
    }
}
