package answer;

public class LeetCode92_反转局部链表_头插法 {
    public static void main(String[] args) {
        new LeetCode92_反转局部链表_头插法().reverseBetween(ListNode.getListNode(new int[]{1,2,3,4,5}),2,4);
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //创建一个新的头节点，这样就可以如果是从第1位置反转，也可同样用头插法操作
        ListNode newHead=new ListNode(0);
        newHead.next=head;
        ListNode pre=newHead;
        ListNode cur=head;
        int step=1;
        while (step<m){
            pre=pre.next;
            cur=cur.next;
            step++;
        }
        while (step<n){
            //r为需要插到头去节点
            ListNode r=cur.next;
            cur.next=cur.next.next;
            r.next=pre.next;
            pre.next=r;
            step++;
        }
        return newHead.next;
    }
}
