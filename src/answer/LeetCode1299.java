package answer;

public class LeetCode1299 {
    public int[] replaceElements(int[] arr) {
        int max=arr[arr.length-1];
        arr[arr.length-1]=-1;
        int t;
        for (int i=arr.length-2;i>=0;i--){
            t=arr[i];
            arr[i]=max;
            max=Math.max(max,t);
        }
        return arr;
    }
}
