class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1 = 0, cand2 = 0;
        int count1 = 0, count2 = 0;

        for (int n : nums) {
            if (n == cand1) {
                count1++;
            } else if (n == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = n;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = n;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int n : nums) {
            if (cand1 == n) {
                count1++;
            } else if (cand2 == n) {
                count2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        int limit = nums.length / 3;
        if (count1 > limit)
            list.add(cand1);
        if (count2 > limit)
            list.add(cand2);
        return list;
    }
}