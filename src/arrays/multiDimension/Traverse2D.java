package arrays.multiDimension;

public class Traverse2D {
    public static void main(String[] args) {

        int[][] array = {{12,2,4},{34,5,3},{23,35,67}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
