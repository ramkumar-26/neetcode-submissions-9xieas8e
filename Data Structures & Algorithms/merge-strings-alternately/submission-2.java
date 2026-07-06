class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder sb = new StringBuilder();
       int min = Math.min(word1.length(), word2.length());
       for(int i=0;i<min;i++){
        sb.append(word1.charAt(i)).append(word2.charAt(i));
       }
       return sb.append(word1.substring(min))
                .append(word2.substring(min))
                .toString();
    }
}