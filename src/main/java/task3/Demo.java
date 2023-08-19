package task3;

public class Demo {
    public static void main(String[] arg) {
        Car car1 = new Car("BMW");
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = car2;
//        String name = car1.getCarModel();
//        System.out.println(name);
        System.out.println(null == null);
        System.out.println(car1 == null);
        System.out.println(car1 != car2);
        System.out.println(car2 == car4);
    }
}
