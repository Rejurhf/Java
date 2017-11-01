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
                if(i >= matrixToMul.getRows()-1 || j >= matrixToMul.getCols()-1)
                    mirrorMatrix[i][j] = 0;
                else
                    mirrorMatrix[i][j] = matrixToMul.getValueOnPosition(i,j);
            }
        }

        System.out.println(mirrorMatrix[2][2]);

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
