class Solution {
    public String mergeAlternately(String word1, String word2) {
    //    StringBuilder sb = new StringBuilder();
    //    int min = Math.min(word1.length(), word2.length());
    //    for(int i=0;i<min;i++){
    //     sb.append(word1.charAt(i)).append(word2.charAt(i));
    //    }
    //    return sb.append(word1.substring(min))
    //             .append(word2.substring(min))
    //             .toString();

    int n = word1.length();
    int m = word2.length();
    int i = 0, j = 0;
    StringBuilder sb = new StringBuilder();
    while(i<n || j < m){
        if(i < n){
            sb.append(word1.charAt(i));
            i++;
        }
        if(j < m){
            sb.append(word2.charAt(j));
            j++;
        }
    }
    return sb.toString();
    }
}