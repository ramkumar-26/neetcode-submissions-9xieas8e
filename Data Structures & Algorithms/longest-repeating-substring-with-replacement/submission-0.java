class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int result = Integer.MIN_VALUE;
        int[] freqArr = new int[26];

        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            freqArr[c - 'A']++;
            maxFreq = Math.max(maxFreq, freqArr[c - 'A']);
            while((right-left+1) - maxFreq > k){
                freqArr[s.charAt(left) - 'A']--;
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
