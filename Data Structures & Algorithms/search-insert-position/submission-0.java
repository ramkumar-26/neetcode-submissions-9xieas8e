class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if(target > nums[right]) return right + 1;
        if(target < nums[left]) return left;
        while(left <= right){
            int mid = (right + left) / 2;
            int currVal = nums[mid];
            if(target == currVal) return mid;
            if(currVal > target && nums[mid - 1] < target) return mid;
            if(currVal > target) right = mid - 1;
            else left = mid+1;

        }
        return -1;
    }
}