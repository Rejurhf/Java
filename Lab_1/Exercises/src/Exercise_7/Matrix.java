package Exercise_7;

class Matrix {
    private int rows, cols;
    private int[][] matrix;

    Matrix(int _rows, int _cols){
        rows = _rows;
        cols = _cols;
        matrix = new int[rows][cols];
        this.fill();
    }

    Matrix(int[][] _array){
        rows = _array.length;
        cols = _array[0].length;
        matrix = new int[rows][cols];
        this.copy(_array);
    }

    void copy(int[][] _array){
        for (int i = 0; i < rows; i++) {
            System.arraycopy(_array[i], 0, this.matrix[i], 0, cols);
        }
    }

    private void fill(){
        for (int i = 0; i < rows; ++i){
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = i + 1;
            }
        }
    }

    void print(){
        for (int i = 0; i < rows; ++i){
            System.out.print("{");
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
                if (j != cols-1) System.out.print(", ");
            }
            System.out.println("}");
        }
    }

    int getRows(){
        return rows;
    }

    int getCols(){
        return rows;
    }

    int getValueOnPosition(int _row, int _col){
        return matrix[_row][_col];
    }

    void add(Matrix _matrix){
        if(this.getRows() == _matrix.getRows() && this.getCols() == _matrix.getCols()){
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++) {
                    matrix[i][j] += _matrix.getValueOnPosition(i, j);
                }
            }
        }
    }

    void sub(Matrix _matrix){
        if(this.getRows() == _matrix.getRows() && this.getCols() == _matrix.getCols()){
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++) {
                    matrix[i][j] -= _matrix.getValueOnPosition(i, j);
                }
            }
        }
    }

    void mul(Matrix _matrix){
        if(this.getRows() == _matrix.getRows() && this.getCols() == _matrix.getCols()){
            int[][] tmpArray = new int[rows][cols];
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    for(int k = 0; k < cols; k++){
                        tmpArray[i][j] += matrix[i][k] * _matrix.getValueOnPosition(k, j);
                    }
                }
            }
            this.copy(tmpArray);
        }
    }
}
