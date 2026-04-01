class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        // Bubble Sort
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(nums[j] > nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }

        // Selection Sort
        for(int i=0;i<n;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}