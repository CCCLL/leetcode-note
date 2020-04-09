package answer;

public class LeetCode1111 {
    public static void main(String[] args) {
        LeetCode1111 leetCode1111=new LeetCode1111();
    }
    public int[] maxDepthAfterSplit(String seq) {
        int[] answer=new int[seq.length()];
        for (int i=1;i<seq.length();i++){
            if (seq.charAt(i)==seq.charAt(i-1)){
                if (answer[i-1]==0)
                    answer[i]=1;
            }else {
                answer[i]=answer[i-1];
            }
        }
        return answer;

    }
}
