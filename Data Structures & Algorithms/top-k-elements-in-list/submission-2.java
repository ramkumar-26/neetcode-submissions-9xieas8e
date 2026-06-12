class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int n : nums){
        //     map.put(n, map.getOrDefault(n, 0) + 1);
        // }

        // return map.entrySet()
        // .stream()
        // // 1. Sort by value DESCENDING
        // .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        // // 2. Take only the top K
        // .limit(k)
        // // 3. Map back to just the Key (the number)
        // .mapToInt(Map.Entry::getKey)
        // .toArray();

        Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
        map.put(n, map.getOrDefault(n, 0) + 1);
    }

    // 2. Create buckets (Array of Lists)
    // Index = frequency, Value = list of numbers with that frequency
    List<Integer>[] bucket = new List[nums.length + 1];

    for (int key : map.keySet()) {
        int frequency = map.get(key);
        if (bucket[frequency] == null) {
            bucket[frequency] = new ArrayList<>();
        }
        bucket[frequency].add(key);
    }

    // 3. Gather the top k from the end of the bucket array
    int[] ans = new int[k];
    int counter = 0;

    for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
        if (bucket[i] != null) {
            for (int num : bucket[i]) {
                ans[counter++] = num;
                if (counter == k) return ans;
            }
        }
    }

    return ans;
    }
}
