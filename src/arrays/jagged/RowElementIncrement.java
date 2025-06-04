package arrays.jagged;

public class RowElementIncrement {
    public static void main(String[] args) {

        int row = 5;
        int[][] array = new int[row][];

        //Creating a 2D array such that first row
        // has 1 element, second row has two
        // elements and so on
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i+1];
        }

        //initialize
        int counter = 0;
        for(int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = counter++;
            }
        }

        //display
        for(int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
