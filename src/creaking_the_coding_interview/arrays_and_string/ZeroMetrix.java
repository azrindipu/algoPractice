package creaking_the_coding_interview.arrays_and_string;

public class ZeroMetrix {

    public ZeroMetrix(){

    }
    public void makeZeroMetrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    this.makeRowZero(matrix, i);
                    this.makeColumnZerow(matrix, j);
                }
            }
        }
    }

    private void makeRowZero(int[][] matrix, int row){
        for(int i=0; i<matrix[row].length; i++){
            matrix[row][i] = 0;
        }
    }
    private void makeColumnZerow(int[][] matrix, int column){
        for(int i=0; i<matrix.length; i++){
            matrix[i][column] = 0;
        }
    }
}
