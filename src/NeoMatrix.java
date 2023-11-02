public class NeoMatrix {
    public static void main(String[] args) {
        int matrixSize = 8;
        int [][] matrix = new int [matrixSize] [matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if(i % 2 ==0){
                    matrix[i][j]=j+1;
                }else {
                    matrix[i][j]= matrixSize - j;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
