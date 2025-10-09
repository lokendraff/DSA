class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int i=0, j=r*c-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            int rn = mid/c;
            int cn = mid%c;
            if(matrix[rn][cn]==target){
                return true;
            }else if(matrix[rn][cn]>target){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return false;
    }
}