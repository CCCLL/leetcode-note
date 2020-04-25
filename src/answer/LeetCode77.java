package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode77 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {


        bt(new ArrayList<>(),n,k,1);
        return res;

    }
    private void bt(List<Integer> list,int n,int k,int i){
        if (list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int j = i; j <=n ; j++) {
            list.add(j);
            bt(list,n,k,j+1);
            list.remove(list.size()-1);
        }
    }
}
