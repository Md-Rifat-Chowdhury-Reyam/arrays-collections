package arrays.initializeWithStream;

import java.util.stream.IntStream;

public class Example1 {

    public static void main(String[] args) {

        int[] array = IntStream.range(0, 10).toArray();
        System.out.println(array); // print memory location
        for(int i = 0; i < array.length; i ++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.print('\n');

        int[] arr2 = IntStream.rangeClosed(1, 4).toArray();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.print('\n');

        // an array of integers using IntStream.of()
        // method
        int[] arr3 = IntStream.of(1, 2, 3, 4).toArray();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
