package arrays.finalArray;

public class Example1 {

    int p = 4;

    public static void main(String[] args) {
        //an array arr as final, which means we can not point arr to a different array, but we can change the value inside the array.
        //Modifying Elements of a Final Array
        final int[] array = {1,3,54,67,8}; //compilation error if like this int[] array = {343,534,8};
        array[2] = 5332;
        for(int i : array)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        //Modifying Object State Referenced by a Final Variable
        final Example1  ex = new Example1();
        ex.p = 444;
        System.out.println(ex.p);

        //Compilation Error When Reassigning Final Reference
        Example1  ex1 = new Example1();
        //ex = ex1;Compilation Error

    }
}
