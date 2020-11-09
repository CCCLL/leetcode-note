package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode51_回溯 {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] b=new char[n][n];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]='.';
            }
        }
        bt(b,0);
        return res;
    }
    private void bt(char[][] b,int row){
        if (row==b.length){
            List<String> list=new ArrayList<>();
            for (char[] chars : b) {
                list.add(new String(chars));
            }
            res.add(list);
            return;
        }
        for (int i = 0; i < b[row].length; i++) {
            if (ck(b,row,i)){
                b[row][i]='Q';
                bt(b,row+1);
                b[row][i]='.';
            }

        }
    }
    private boolean ck(char[][] b,int row,int i){
        for (int j = row-1; j >=0 ; j--) {
            if (b[j][i]=='Q'){
                return false;
            }
        }
        for (int j = row-1,k=i-1; j >=0 && k>=0 ; j--,k--) {
            if (b[j][k]=='Q'){
                return false;
            }
        }
        for (int j = row-1,k=i+1; j >=0 && k<b[row].length ; j--,k++) {
            if (b[j][k]=='Q'){
                return false;
            }
        }
        return true;
    }
}
