class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int ans=0;
        while(i<nums.length ){
            int n = nums[i];
            ans++;
            while(i<nums.length && nums[i]-n<=k){
                i++;
            }
        }
        return ans;
    }
}