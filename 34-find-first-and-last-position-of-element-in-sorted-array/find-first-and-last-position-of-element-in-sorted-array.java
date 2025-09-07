class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = findIndex(nums, target, false);
        ans[1] = findIndex(nums, target, true);
        return ans;
    }

    public int findIndex(int arr[], int t, boolean isFindingRight){
        int i=0, j=arr.length-1, ans=-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==t){
                ans = mid;
                if(isFindingRight){
                   i = mid+1;
                }else{
                   j = mid-1;
                }
            }else if(arr[mid]<t){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return ans;
    }
}