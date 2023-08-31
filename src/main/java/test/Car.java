package test;

public class Car {
    private static int numOfCars = 0;
    //другие поля
    public Car() {
        numOfCars++;
    }

    public static void setNumOfCars(int numOfCars) {
        Car.numOfCars = numOfCars;
    }

    //другие методы
    public int getNumOfCars() {
        return numOfCars;
    }


}

