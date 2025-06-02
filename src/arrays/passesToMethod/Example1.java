package arrays.passesToMethod;

public class Example1 {
    public static void main(String[] args) {

        int[] array = {2,4,6,6,4};
        addition(array);

    }

    //method
    public static void addition(int[] methodArray)
    {
        int  sum = 0;
        for (int i = 0; i < methodArray.length; i++)
        {
            sum += methodArray[i];
        }
        System.out.println(sum);
    }
}


