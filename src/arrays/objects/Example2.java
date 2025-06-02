package arrays.objects;

public class Example2 {
    public static void main(String[] args) {

        Car[] array = new Car[]
                {new Car("Toyota", 432354),
                new Car("BMW", 42342424),
                new Car("VolksWagen", 789687)};

        for (Car c : array)
        {
            System.out.println(c);
        }

    }
}

class Car{
    public String carName;
    public  int modelNumber;

    Car(String carName, int modelNumber) {
        this.carName  = carName;
        this.modelNumber = modelNumber;
    }

    @Override
    public String toString() {
        return "Car [carName=" + carName + ", modelNumber=" + modelNumber + "]";
    }
}
