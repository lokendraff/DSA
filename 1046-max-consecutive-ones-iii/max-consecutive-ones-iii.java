class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0, j=0,c=0, ans=0;
        while(j<nums.length){
            if(nums[j]==0){
                c++;
            }

            if(c>k){
                while(nums[i]!=0){
                    i++;
                }
                i++;
                c--;
            }
            
            ans = Math.max(ans, j-i+1);
            j++;
        }

        return ans;
    }
}