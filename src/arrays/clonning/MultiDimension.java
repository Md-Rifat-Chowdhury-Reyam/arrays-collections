package arrays.clonning;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] array = {{2,3,4},{3,35,6}};

        int[][] cloneArray = array.clone();

        // will print false
        System.out.println(array == cloneArray);
        System.out.println(array.length == cloneArray.length);
        System.out.println(array[0].length == cloneArray[0].length);

        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(array[0][0] == cloneArray[0][0]);
        System.out.println(array[1] == cloneArray[1]);

    }
}
