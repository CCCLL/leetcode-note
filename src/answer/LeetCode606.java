package answer;

public class LeetCode606 {

    public String tree2str(TreeNode t) {
        return helper(t);
    }
    private String helper(TreeNode t){
        if (t==null) return "";
        if (t.left==null&&t.right==null) return Integer.toString(t.val);
        String left=helper(t.left);
        String right=helper(t.right);
        StringBuilder stringBuilder=new StringBuilder();
        if (t.right!=null){
            stringBuilder.append(t.val).append("(").append(left).append(")").append("(").append(right).append(")");
        }else {
            stringBuilder.append(t.val).append("(").append(left).append(")");
        }
        return stringBuilder.toString();
    }
}
