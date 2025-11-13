class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int ans[][] = new int[r][c];

        for(int i=0; i<r; i++){
            int row[] = arr[i];
            int k=0;
            for(int j=row.length-1; j>=0; j--){
                ans[i][k] = row[j]^1;
                k++;
            }
        }
        return ans;
    }
}