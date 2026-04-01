class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
    int[] res = new int[n];
    
    // Step 1: Calculate Prefix products
    // res[i] will store the product of all elements to the left of nums[i]
    res[0] = 1;
    for (int i = 1; i < n; i++) {
        res[i] = res[i - 1] * nums[i - 1];
    }
    
    // Step 2: Calculate Suffix products on the fly
    // Use a variable 'right' to track the product of elements to the right
    int right = 1;
    for (int i = n - 1; i >= 0; i--) {
        // Multiply the existing prefix product by the current suffix product
        res[i] = res[i] * right;
        // Update the suffix product for the next element to the left
        right = right * nums[i];
    }
    
    return res;
    }
}  
