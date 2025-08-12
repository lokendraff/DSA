class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans =0;
        int i=1, j=0;
        for(int n : piles){
            j = Math.max(j, n);
        }
            while(i<=j){
                int k = i+(j-i)/2;
                long c=0;
                for(int idx=0; idx<piles.length; idx++){
                   c += (piles[idx]+k-1)/k;
                }
                if(c>h){
                    i = k+1;
                }else{
                    ans = k;
                    j=k-1;
                }
            }
            return ans;
    }
}