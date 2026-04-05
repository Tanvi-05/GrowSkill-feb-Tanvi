package dailyAssignment;


import java.util.Scanner;

public class Program_Matrix_03_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = 3;
        int c = 4;
        
        int[][] matrixA = new int[r][c];
        int[][] matrixB = new int[r][c];
        int[][] resultMatrix = new int[r][c];

        //  Matrix A 3x4
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        //  Matrix B 3x4
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        int maxElement = Integer.MIN_VALUE;
        
        System.out.println("\nResult Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
             
                System.out.print(resultMatrix[i][j] + " ");
                
                if (resultMatrix[i][j] > maxElement) {
                    maxElement = resultMatrix[i][j];
                }
            }
            System.out.println(); }

        System.out.println("\nMaximum Element: " + maxElement);
        
        sc.close();
    }
}