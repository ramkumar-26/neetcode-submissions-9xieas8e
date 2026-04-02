class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer = m + n - 1;
        m = m -1;
        n = n -1;
        while(n >= 0){
            if(m >= 0 && nums1[m] > nums2[n]){
                nums1[pointer--] = nums1[m--];
            }else{
                nums1[pointer--] = nums2[n--];
            }
        }
    }
}