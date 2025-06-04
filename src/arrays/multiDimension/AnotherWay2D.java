package arrays.multiDimension;

import java.util.Scanner;

public class AnotherWay2D {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row value");
        int n = scanner.nextInt();
        System.out.println("enter column value");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        int t = 0;
        System.out.println("enter matrix : ");
        for (int i = 0; i < n; i++) {

            //all rows have the same column count
            t = m;
            array[i] = new int[m]; //input columns

            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
        scanner.close();
    }
}
