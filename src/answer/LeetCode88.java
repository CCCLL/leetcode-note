package answer;

public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1=m-1;
        int n2=n-1;
        for (int i = nums1.length-1; i >= 0; i--) {
            if (n2<0){
                break;
            }
            if (n1<0){
                nums1[i]=nums2[n2--];
            }else {
                if (nums1[n1]>nums2[n2]){
                    nums1[i]=nums1[n1--];
                }else {
                    nums1[i]=nums2[n2--];
                }
            }
        }

    }
}
