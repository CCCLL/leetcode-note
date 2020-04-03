package answer;

public class LeetCode654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(0,nums.length,nums);
    }
    private TreeNode construct(int h, int f, int[] nums) {
        if(h==f){
            return null;
        }
        int maxIndex = h;
        for (int i = h; i < f; i++) {
            if (nums[i]>nums[maxIndex]){
                maxIndex=i;
            }
        }
        TreeNode treeNode=new TreeNode(nums[maxIndex]);
        treeNode.left=construct(h,maxIndex,nums);
        treeNode.right=construct(maxIndex+1,f,nums);
        return treeNode;

    }

}
