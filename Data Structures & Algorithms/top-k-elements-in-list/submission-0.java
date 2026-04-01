class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return map.entrySet()
        .stream()
        // 1. Sort by value DESCENDING
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        // 2. Take only the top K
        .limit(k)
        // 3. Map back to just the Key (the number)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }
}
