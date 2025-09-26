class Solution {
    public int[] shuffle(int[] nums, int n) {
        int p=0;
        int arr[] = new int[2*n];
        int m = n;
        for(int i=0; i<m; i++){
            arr[p] = nums[i];
            arr[p+1] = nums[n];
            n++;
            p+=2;
        }
        return arr;
    }
}