package automobile;

public class CarDemo {
    public static void main(String[] args) {
        CarService service = new CarService();

        service.showAllCars();

        service.showCarsByBrand("Mercedes");

        service.showCarsByExplTerm(10);

        service.showCarsByColor("red");

        service.showCarsByYearAndMaxPrice(2023,870000);

        System.out.println(service.findCarById(1));

        System.out.println(service.findCarByBrandAndModelAndYear("Mercedes", "E63", 2023));
    }
}
