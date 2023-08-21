package automobile;

import shop.Product;

import java.util.Objects;

public class CarService {
//Реалізувати методи:
//- показати усі автомобілі             void showAllCars();++++++++
//- показати лист автомобілів заданої марки        void showCarsByBrand(String brand);+++++++
//- показати лист автомобілів які експлуатуються більше years років        void showCarsByExplTerm(int years);+++++
//- показати лист автомобілів заданого кольору      void showCarsByColor(String color)++++++++++++++
//- показати лист автомобілів заданого року випуску, вартість яких менше указаної  void showCarsByYearAndMaxPrice(int years, int maxPrice);++++++
//- знайти авто по id         Car findCarById(int id);+++++++++++
//- знайти авто по марці, моделі та році випуску      Car findCarByBrandAndModelAndYear(String brand, String model, int year);++++++

    private Car[] cars;

    {
        Car car1 = new Car(1,"BMW","i3",2017,"blue", 600_000);
        Car car2 = new Car(2,"BMW","Z4",2005,"blue", 300_000);
        Car car3 = new Car(3,"Mercedes","E63 ",2023,"brown", 900_000);
        Car car4 = new Car(4,"Mercedes","C63 ",2023,"red", 850_000);
        cars = new Car[]{car1,car2,car3,car4};
    }

    public void showAllCars(){
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void showCarsByBrand(String brand){
        for (Car car : cars) {
            if (Objects.equals(car.getBrand(), brand)){
                System.out.println(car);
            }
        }
    }

    public void showCarsByExplTerm(int years){
        for (Car car : cars) {
            if (2023-years >= car.getYear()){
                System.out.println(car);
            }
        }
    }

    public void showCarsByColor(String color){
        for (Car car : cars) {
            if (Objects.equals(car.getColor(), color)){
                System.out.println(car);
            }
        }
    }

    public void showCarsByYearAndMaxPrice(int years, int maxPrice){
        for (Car car : cars) {
            if (car.getYear() == years && maxPrice >= car.getPrice()){
                System.out.println(car);
            }
        }
    }

    public Car findCarById(int id){
        for (Car car : cars) {
            if (car.getId() == id){
                return car;
            }
        }
        return null;
    }

    public Car findCarByBrandAndModelAndYear(String brand, String model, int year){
        for (Car car : cars) {
            if (Objects.equals(car.getBrand(), brand) && Objects.equals(car.getModel(), model) && car.getYear() == year){
                return car;
            }
        }
        return null;
    }

}
