class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for(int arr[] : accounts){
           int sum = 0;
           for(int i : arr){
                sum+=i;
           }
           ans = Math.max(sum, ans); 
        }
        return ans;
    }
}