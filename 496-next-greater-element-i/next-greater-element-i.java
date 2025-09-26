class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int arr[] = new int[n1];
        for(int i=0; i<n1; i++){
            int n = nums1[i], ans=-1;
            for(int j=0; j<n2; j++){
                if(nums2[j]==n){
                    j++;
                    while(j<n2){
                        if(nums2[j]>n){
                            ans = nums2[j];
                            break;
                        }
                        j++;
                    }
                    break;
                }
            }
            arr[i] = ans;
        }
        return arr;
    }
}