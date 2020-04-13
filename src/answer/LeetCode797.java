package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode797 {
    private List<Integer> list=new ArrayList<>();
    private List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(graph,0);
        return res;


    }
    private void dfs(int[][] graph,int v){
        list.add(v);
        if (v==graph.length-1){
            res.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        for (int i=0;i<graph[v].length;i++){
            dfs(graph,graph[v][i]);
            list.remove(new Integer(graph[v][i]));
        }

    }
}
