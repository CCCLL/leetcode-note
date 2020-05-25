package answer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode1452 {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        Set<String>[] sets=new Set[favoriteCompanies.size()];

        List<Integer> res=new ArrayList<>();
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            sets[i]=new HashSet<>(favoriteCompanies.get(i));
        }
        for (int i = 0,i1 = 0; i < favoriteCompanies.size(); i++) {
            for (;i1 < sets.length; i1++) {
                if (i!=i1 && sets[i1].containsAll(favoriteCompanies.get(i))){
                    break;
                }
            }
            if (i1==sets.length){
                res.add(i);
            }
            i1=0;
        }
        return res;
    }
}
