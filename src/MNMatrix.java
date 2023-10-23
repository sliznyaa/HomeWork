import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MNMatrix {
    static public void main (String[]args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість рядків (M): ");
        int m = scanner.nextInt();
        System.out.print("Введіть кількість стовпців (N): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix [i][j] = random.nextInt(5);
            }
         }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("__________________________");

        int[][] transposedMatrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
