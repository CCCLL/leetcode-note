package golden;

import answer.ListNode;
import answer.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GoldCode0406 {
    public ListNode[] listOfDepth(TreeNode tree) {
        Queue<TreeNode> queue= new LinkedList<>();
        List<ListNode> listNodes=new ArrayList<>();
        ListNode head=new ListNode(0);
        ListNode p=head;
        queue.add(tree);
        int size;
        TreeNode treeNode;
        while (!queue.isEmpty()){
            size=queue.size();
            while (size-->0){
                treeNode=queue.poll();
                ListNode listNode=new ListNode(treeNode.val);
                p.next=listNode;
                p=p.next;
                if (treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if (treeNode.right!=null){
                    queue.add(treeNode.right);
                }
            }
            listNodes.add(head.next);
            p=head;
        }
        return listNodes.toArray(new ListNode[listNodes.size()]);
    }
}
