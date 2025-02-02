package LeetCode;

import java.util.Arrays;
public class LTCode008 {
    void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = n-1,j=m-1,k=m+n-1;j >= 0;k--){
            if( j < 0 ) break;
            if(i >= 0 && nums1[i] > nums2[j]){
                
                nums1[k] = nums1[i--];
            }else{
                nums1[k] = nums2[j--];
            }
        }
    }
    public static void main(String[] args) {
        LTCode008 solution = new LTCode008();
        int[] nums1 = {1,2,3,0,0,0};
        int m=3;
        int[] nums2 = {2,5,6};
        int n=2;
        
        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
