package arrays.multiDimension;

public class ThreeD {
    public static void main(String[] args) {

        int[][][] threeDimension = new int[2][2][2];

        int x = threeDimension.length;
        int y = threeDimension[0].length;
        int z = threeDimension[0][0].length;


        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    threeDimension[i][j][k] = index;
                    index++;
                }
            }
        }

//print the 3D index wise
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(threeDimension[i][j][k]++);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
