package LeetCode;

class LTCode006 {
    public int removeDuplicates() {
        int[] nums = {1,1,2};
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        //System.out.println("Length of the array after removing duplicates: ");
        int k = 0;
        for(int x : nums1){
            if(k==0 || x != nums1[k - 1]){
                nums1[k++] = x;
            }
        }
        return k;

        
    }   
public static void main(String[] args) {
    LTCode006 solution = new LTCode006();
    System.out.println(solution.removeDuplicates());
}
}