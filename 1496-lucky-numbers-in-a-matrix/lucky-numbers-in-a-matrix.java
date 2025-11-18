class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int rowMin[] = new int[r];
        int colMax[] = new int[c];
        for(int i=0; i<r; i++){
            int minRow = matrix[i][0];
            for(int j=1; j<c; j++){
                minRow = Math.min(minRow, matrix[i][j]);
            }

            rowMin[i] = minRow;
        }


        for(int j=0; j<c; j++){
            int maxCol = matrix[0][j];
            for(int i=1; i<r; i++){
                maxCol = Math.max(maxCol, matrix[i][j]);
            }

            colMax[j] = maxCol;
        }


        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j]==colMax[j] && matrix[i][j]==rowMin[i]){
                    list.add(matrix[i][j]);
                }
            }
        }

        return list;
    }
}