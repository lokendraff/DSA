class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<k){
                ans++;
            }
            int product = 1;
            for(int j=i+1; j<nums.length; j++){
                product *= nums[j];
                if(nums[i]*product<k){
                    ans++;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}