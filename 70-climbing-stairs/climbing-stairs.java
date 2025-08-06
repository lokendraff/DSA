class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return fibo(n, dp); // Yahaan 'n' pass karo, 'n+1' nahi.
    }

    public int fibo(int n, int dp[]){
        if(n == 0){ // 0 stairs ko climb karne ka 1 tareeka hai
            return 1;
        }
        if(n < 0){ // Negative steps invalid hain
            return 0;
        }
        
        if(dp[n]!=-1){
            return dp[n];
        }
        
        // n stairs tak pahunchne ke ways:
        // (n-1) se 1 step le kar ya (n-2) se 2 steps le kar
        return dp[n] = fibo(n-1, dp) + fibo(n-2, dp);
    }
}