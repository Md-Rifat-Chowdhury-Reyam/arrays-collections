package arrays.clonning;

public class SingleDimension {
    public static void main(String[] args) {

        //main array
        int[] array = {2,3,5,6};
        for(int i : array)
        {
            System.out.println("main array : " + i);

        }

        //clone array
        int[] cloneArray = array.clone();
        // will print false as shallow copy is created
        System.out.println(cloneArray == array);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.println("cloneArray : " + cloneArray[i]);

        }


    }
}
