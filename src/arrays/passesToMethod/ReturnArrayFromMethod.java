package arrays.passesToMethod;

public class ReturnArrayFromMethod {
    public static void main(String[] args) {

        int[] array = method();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

    }

    public static int[] method()
    {
        return  new int[] {2,3,423,2,4};
    }
}

