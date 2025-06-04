package arrays.ArraysClass;

import java.util.Arrays;

public class AsListMethod {
    public static void main(String[] args) {
        int[] array = {1,3,4,5};

        System.out.println("When asList() is used with primitive arrays, it shows the memory reference "+
                Arrays.asList(array));
    }
}
