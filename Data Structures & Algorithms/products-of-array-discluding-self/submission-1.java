class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 0, nums.length, 1);
        int left = 1;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            ans[i] = ans[i] * left;
            left = left * nums[i];
        }

        int right = 1;
        for(int i=len-1;i>=0;i--){
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }
        return ans;
    }
}  
