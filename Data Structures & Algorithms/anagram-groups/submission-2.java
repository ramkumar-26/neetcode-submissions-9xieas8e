class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            String key = findKey(s);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private String findKey(String s){
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int n : count){
            sb.append(n).append("#");
        }
        return sb.toString();
    }
}
