package answer;

public class LeetCode1079 {
    public static void main(String[] args) {
        System.out.println(new LeetCode1079().numTilePossibilities("AB"));
    }
    public int numTilePossibilities(String tiles) {
        int[] abc=new int[26];
        for (int i = 0; i < tiles.length(); i++) {
            abc[tiles.charAt(i)-'A']++;
        }
        return bt(abc);

    }
    private int bt(int[] abc){
        int res=0;
        for (int i = 0; i < abc.length; i++) {
            if (abc[i]==0){
                continue;
            }
            res++;
            abc[i]--;
            res+=bt(abc);
            abc[i]++;
        }
        return res;
    }

}
