class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length / 2;
        int ans = nums[0];
        int maxCount = 1;
        for(int i=0;i<=len;i++){
            int currCount = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], currCount);
            if(maxCount < currCount){
                ans = nums[i];
                maxCount = currCount;
            }
        }
        return ans;
    }
}