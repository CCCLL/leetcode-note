package golden;

import answer.ListNode;

public class GoldCode0203 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
