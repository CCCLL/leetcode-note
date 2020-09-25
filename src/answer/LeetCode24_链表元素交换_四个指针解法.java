package answer;

public class LeetCode24_链表元素交换_四个指针解法 {
    //多用些指针也没关系，要明确那些指针要做什么，链表问题最好画图看下
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode p=dummy;

        while (p.next!=null&&p.next.next!=null){
            ListNode node1=p.next;
            ListNode node2=node1.next;
            ListNode next=node2.next;
            p.next=node2;
            node2.next=node1;
            node1.next=next;
            p=node1;
        }
        return dummy.next;
    }

}
