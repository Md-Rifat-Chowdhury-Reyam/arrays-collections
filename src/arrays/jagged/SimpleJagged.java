package arrays.jagged;

public class SimpleJagged {
    public static void main(String[] args) {


        int[][] array = new int[2][];

        array[0] = new int[3]; //array[0] --> index of row or number of row, new int[3]--> column
        array[1] = new int[2];
        
        //initialize array
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] );
            }
            System.out.println();
        }
    }
}
