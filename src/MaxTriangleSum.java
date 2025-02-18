import java.util.Scanner;

public class MaxTriangleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("Matrix must be square!");
            return;
        }

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sumUpperTriangle = 0;
        int sumLowerTriangle = 0;

        // Calculate the sums of both triangles
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i + j <= cols - 1) { // Upper triangle condition
                    sumUpperTriangle += matrix[i][j];
                } else { // Lower triangle condition
                    sumLowerTriangle += matrix[i][j];
                }
            }
        }

        // Output the larger of the two sums
        int largestSum = Math.max(sumUpperTriangle, sumLowerTriangle);
        System.out.println("Largest triangle sum: " + largestSum);
    }
}
