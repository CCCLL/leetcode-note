package answer;

public class LeetCode1451 {
    public static void main(String[] args) {
        System.out.println(new LeetCode1451().arrangeWords("Leetcode is cool"));
    }
    public String arrangeWords(String text) {
        String[] strings=text.split(" ");
        char[] chars = strings[0].toCharArray();
        chars[0]=(char)((int)chars[0] + 32);
        strings[0]=new String(chars);

        for (int i=0; i<strings.length; i++){
            for (int j = 0; j < strings.length-1-i; j++) {
                if (strings[j].length()>strings[j+1].length()){
                    String tmp=strings[j];
                    strings[j]=strings[j+1];
                    strings[j+1]=tmp;
                }
            }

        }
        chars = strings[0].toCharArray();
        chars[0]=(char)((int)chars[0] - 32);
        strings[0]=new String(chars);
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < strings.length - 1; i++) {
            res.append(strings[i]+" ");
        }
        res.append(strings[strings.length-1]);
        return res.toString();


    }
}
