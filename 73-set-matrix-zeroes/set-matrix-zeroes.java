class Solution {
    public class Container{
        int row;
        int col;

        Container(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public void setZeroes(int[][] matrix) {
        List<Container> list = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    list.add(new Container(i,j));
                }
            }
        }

        for(Container c : list){
            int rn = c.row;
            int cn = c.col;
            for(int i=0; i<matrix[rn].length; i++){
                matrix[rn][i]=0;
            }

            for(int i=0; i<matrix.length; i++){
                matrix[i][cn] = 0;
            }
        }
        
    }
}