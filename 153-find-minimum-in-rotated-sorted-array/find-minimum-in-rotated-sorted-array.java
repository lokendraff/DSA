class Solution {
    public int findMin(int[] nums) {
        int i=0, j=nums.length-1; 
        int ans = Integer.MAX_VALUE;
        while(i<=j){
            int mid = (j-i)/2 + i;
            if(nums[mid]>nums[j]){
                i = mid+1;
            }else{
                ans = Math.min(nums[mid], ans);
                j=mid-1;
            }
        }
        return ans;
    }
}