class Solution {
    sortColors(nums) {
        let low = 0;
        let mid = 0;
        let high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] === 0) {
                this.swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] === 1) {
                mid++;
            } else {
                this.swap(nums, mid, high);
                high--;
            }
        }
    }

    swap(nums, a, b) {
        [nums[a], nums[b]] = [nums[b], nums[a]];
    }
}