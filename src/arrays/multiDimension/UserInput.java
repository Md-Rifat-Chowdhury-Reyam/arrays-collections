package arrays.multiDimension;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows number : ");
        int rows = scanner.nextInt();
        System.out.println("Enter columns number: " );
        int columns = scanner.nextInt();

        //declare array and allocate memory
        int[][] matrix = new int[rows][columns];

        //take input matrix
        System.out.println("Enter matrix elements : ");
        for (int i = 0; i < rows; i++ )
        {
            for (int j = 0; j < columns; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //print matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        scanner.close();

    }
}
