class Solution {

    private String encryptKey = "1234567ygfdxcvbnjkiutr";

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            // Format: [length] + [#] + [string]
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
            // 1. Find the delimiter to get the length
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            
            // 2. Parse the length
            int length = Integer.parseInt(s.substring(i, j));
            
            // 3. Extract the string based on length
            // Content starts at j + 1 and goes for 'length' characters
            String str = s.substring(j + 1, j + 1 + length);
            res.add(str);
            
            // 4. Move pointer to the start of the next encoded segment
            i = j + 1 + length;
        }
        
        return res;
    }
}
