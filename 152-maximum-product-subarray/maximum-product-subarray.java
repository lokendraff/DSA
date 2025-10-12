class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE, n=nums.length;
        for(int i=0; i<n; i++){
            int p = nums[i];
            ans = Math.max(ans, p);
            for(int j=i+1; j<n; j++){
                p *= nums[j];
                ans = Math.max(ans, p);
            }
        }

        return ans;
    }
}