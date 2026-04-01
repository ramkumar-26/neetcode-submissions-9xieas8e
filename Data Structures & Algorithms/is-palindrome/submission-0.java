class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int i=0, j = c.length-1;
        while(i < j){
            while(i < j && !Character.isLetter(c[i]) && !Character.isDigit(c[i])){
                i++;
            }
            while(i < j && !Character.isLetter(c[j]) && !Character.isDigit(c[j])){
                j--;
            }
            if(Character.toLowerCase(c[i]) != Character.toLowerCase(c[j])){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
