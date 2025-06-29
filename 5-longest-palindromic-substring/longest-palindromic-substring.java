class Solution {
    public String longestPalindrome(String s) {
        if(s.equals("")) return s;
        int maxLen = 0, ansIndex = 0, i=0, j=0;
        while(i<s.length()){
            if(j==s.length()) {
                i++;
                j=i;
                continue;
            }
            if(isPalindrom(s.substring(i, j+1))){
                if((j-i+1)>=maxLen){
                    maxLen = j-i+1;
                    ansIndex = i;
                }
            }
            j++;
        }
        return s.substring(ansIndex, ansIndex+maxLen);
    }
    public static boolean isPalindrom(String s){
        int i=0, j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}