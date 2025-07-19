class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==k){
                ans++;
            }
            int c=0;
            for(int j=i+1; j<nums.length; j++){
                c+=nums[j];
                if(nums[i]+c==k){
                    ans++;
                    
                }
            }
        }
        return ans;
    }
}