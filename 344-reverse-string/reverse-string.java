class Solution {
    public void reverseString(char[] s) {
        sol(s, 0, s.length-1);
    }

    public static void sol(char[] s, int i, int j){
        if(i>=j){
            return;
        }
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        sol(s, i+1, j-1);
    }
}