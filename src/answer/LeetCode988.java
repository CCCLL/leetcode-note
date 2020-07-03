package answer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.LinkedList;
import java.util.List;

public class LeetCode988 {
    public static void main(String[] args) {
//        new LeetCode988().smallestFromLeaf(TreeNode.getTreeNode(new int[]{25, 1, 3, 1, 3, 0, 2}));
        System.out.println("abcd");
    }

    List<String> list;

    public String smallestFromLeaf(TreeNode root) {
        list = new LinkedList<>();
        helper(root, "");
        String res = list.get(0);
        if (list.size() == 1) return res;
        for (int i = 1; i < list.size(); i++) {
            int len = Math.min(res.length(), list.get(i).length());
            int index = 0;
            for (; index < len; index++) {
                if (res.charAt(index) > list.get(i).charAt(index)) {
                    res = list.get(i);
                    break;
                }
                if (res.charAt(index) < list.get(i).charAt(index)) {
                    break;
                }
            }
            if (index == len) {
                res = res.length() > list.get(i).length() ? list.get(i) : res;
            }
        }
        return res;
    }

    private void helper(TreeNode root, String s) {
        if (root == null) return;
        s = Character.toString((char) (root.val + 'a')) + s;
        if (root.left == null && root.right == null) {
            list.add(s);
        }
        helper(root.left, s);
        helper(root.right, s);
    }
}
