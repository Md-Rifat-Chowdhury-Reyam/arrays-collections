package arrays.ArraysClass;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,3,5,23,2,233,3654};
        int[] originalArray = array.clone(); // keep a copy of the original

        Arrays.sort(array);
        int findNumber = 233;
        int findNumber2 = 2;

        System.out.println(findNumber + " in sorted array at index: "
                + Arrays.binarySearch(array, findNumber));

        System.out.println(findNumber2 + " in sorted array at index: "
                + Arrays.binarySearch(array, findNumber2));

        // To find original indices:
        System.out.println("\nOriginal positions:");

        System.out.println(findNumber + " was originally at index: "
                + findIndex(originalArray, findNumber));
        System.out.println(findNumber2 + " was originally at index: "
                + findIndex(originalArray, findNumber2));
    }

    private static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}