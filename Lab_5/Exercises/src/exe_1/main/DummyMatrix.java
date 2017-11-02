package exe_1.main;

public class DummyMatrix extends Matrix{
    DummyMatrix(){
        super();
    }

    DummyMatrix(Matrix oldMatrix){
        rows = oldMatrix.getRows();
        cols = oldMatrix.getCols();
        this.matrix = new int[rows][cols];
        copy(oldMatrix.matrix);
    }

    public int[][] mulWrongDimMatrix(Matrix matrixToMul){
        int[][] tmpArray = new int[rows][cols];
        int[][] mirrorMatrix = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(i >= matrixToMul.getRows() || j >= matrixToMul.getCols())
                    mirrorMatrix[i][j] = 1;
                else
                    mirrorMatrix[i][j] = matrixToMul.getValueOnPosition(i,j);
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                for(int k = 0; k < cols; k++){
                    tmpArray[i][j] += matrix[i][k] * mirrorMatrix[k][j];
                }
            }
        }

        return tmpArray;
    }
}
