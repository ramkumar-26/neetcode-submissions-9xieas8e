class NumMatrix {
    private int[][] matrix;
    public NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        this.matrix = matrix;

        for(int i=1; i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] += matrix[i-1][j];
            }
        }

        for(int i=0; i<row;i++){
            for(int j=1;j<col;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result = matrix[row2][col2];

        int top = row1 == 0 ? 0 : matrix[row1-1][col2];
        int left = col1 == 0 ? 0 : matrix[row2][col1-1];
        int topLeft = (row1 == 0 || col1 ==0) ? 0 : matrix[row1-1][col1-1];

        return result - top - left + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */