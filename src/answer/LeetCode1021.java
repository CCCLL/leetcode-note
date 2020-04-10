package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1021 {
    public static void main(String[] args) {
        System.out.println("abcd".substring(1,1)+"aa");
    }
    public String removeOuterParentheses(String S) {
        StringBuilder res=new StringBuilder();
        int index=0;
        int count=0;
        for (int i=0;i<S.length();i++){
            if ('('== S.charAt(i)){
                count++;
            }else {
                count--;
            }
            if (count==0){  //count等于零，说明左右括号相匹配，则形成原语
                res.append(S.substring(index+1,i));   //去掉头和尾，添加到返回值中
                index=i+1;   //记录下一个需要添加到返回值中的字符串的头位置
            }
        }
        return res.toString();
    }
}
