package arrays.objects;

public class ObjectArray {
    public static void main(String[] args) {
        //create array of Student

        //declare array of Student
        Student[] arr;
        //allocating memory
        arr = new Student[5];
        //initialize
        arr[0] = new Student(1, "Rifat");
        arr[1] = new Student(2, "Reyam");
        arr[2] = new Student(3, "Moksed");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Element at index " + i + " : " + arr[i].roll + " " +arr[i].name );
        }
    }
}

class Student
{
    public int roll;
    public String name;

    //constructor
    Student(int roll, String name)
    {
        this.roll = roll;
        this.name = name;

    }
}

