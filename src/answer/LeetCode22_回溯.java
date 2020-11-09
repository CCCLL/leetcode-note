package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode22_回溯 {
    public static void main(String[] args) {
        new LeetCode22_回溯().generateParenthesis(2);
    }
    public List<String> generateParenthesis(int n) {
        int l=n;
        int r=n;
        List<String> list=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder("(");
        bt(l-1,r,n,stringBuilder,list);
        return list;

    }
    private void bt(int l,int r,int n,StringBuilder stringBuilder,List<String> list){
        if (stringBuilder.length()==n*2){
            list.add(new String(stringBuilder));
            return;
        }
        if (l>0){
            stringBuilder.append('(');
            bt(l-1,r,n,stringBuilder,list);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        if (l<r){                       //保证有效括号
            stringBuilder.append(')');
            bt(l,r-1,n,stringBuilder,list);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
