class Solution {
    private int memo[][] = new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
        Arrays.stream(memo).forEach(row -> Arrays.fill(row, -1));
        return helper(text1, text2, 0, 0);
    }

    public int helper(String s1, String s2, int i, int j){
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }

        if(memo[i][j]!=-1){
            return memo[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            int next = 1 + helper(s1, s2, i+1, j+1);
            memo[i][j] = next;
            return next;
        }else{
            int left = helper(s1, s2, i+1, j);
            int right = helper(s1, s2, i, j+1);
            int ans =  Math.max(left, right);
            memo[i][j] =  ans;
            return ans;
        }
    }
}