class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int k=0; k<matrix.length; k++){
            int arr[] = matrix[k];
            if(arr[arr.length-1]<target){
                continue;
            }
            int i=0, j=arr.length-1;
            while(i<=j){
                int mid = i+(j-i)/2;
                if(arr[mid]==target){
                    return true;
                }else if(arr[mid]>target){
                    j=mid-1;
                }else{
                    i = mid+1;
                }
            }

        }
        return false;
    }
}