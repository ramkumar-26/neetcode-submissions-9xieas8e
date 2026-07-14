class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    left++;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return ans;
    }
}