package answer;

import java.util.Arrays;

public class LeetCode108_二叉搜索树_有序数组转换 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dt(nums,0,nums.length);


    }
    private TreeNode dt(int[] nums, int from, int to){
        if (from==to) return null;
        int index=(from+to)>>1;
        TreeNode root=new TreeNode(nums[index]);
        root.left=dt(nums, from, index);
        root.right=dt(nums, index+1, to);
        return root;

    }
}
