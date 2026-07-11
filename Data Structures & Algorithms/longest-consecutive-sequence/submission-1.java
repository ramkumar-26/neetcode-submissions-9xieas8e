class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int res = 0;
        for(int n: set){
            if(!set.contains(n-1)){
                int count = 1;
                int nextEle = n+1;
                while(set.contains(nextEle)){
                    nextEle+=1;
                    count++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
