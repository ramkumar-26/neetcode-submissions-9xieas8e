class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int n : nums){
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> map : freqMap.entrySet()){
            int freq = map.getValue();
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(map.getKey());
        }

        int[] result = new int[k];
        int counter = 0;
        for(int i = bucket.length - 1; i>=0 && counter < k; i--){
            if(null != bucket[i]){
                List<Integer> list = bucket[i];
                for(int n : list){
                    result[counter++] = n;
                }
            }
        }
        return result;
    }
}
