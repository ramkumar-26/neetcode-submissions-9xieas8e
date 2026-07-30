class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    majorityElement(nums) {
        let candidate = nums[0];
        let vote = 0;
        for(let n of nums){
            if(vote === 0){
                candidate = n;
            }
            if(candidate === n){
                vote++;
            }else{
                vote--;
            }
        }
        return candidate;
    }
}
