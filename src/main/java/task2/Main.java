package task2;

public class Main {

    public static void main(String[] args) {
        Tiger tigerID_1 = new Tiger();

        tigerID_1.setVegan(false);
        System.out.println(tigerID_1.isVegan());
        System.out.println(tigerID_1.getAge());
        tigerID_1.loudSound();

        tigerID_1.setAge(8);
        System.out.println(tigerID_1.getAge());

        Animals tigerID_2 = new Tiger();
        Animals crocodileID_1 = new Crocodile();
        findCrocodile(tigerID_2);
        findCrocodile(crocodileID_1);

    }

    public static void findCrocodile(Animals animals){
        if (animals.showColor() == "Green"){
            System.out.println("This is crocodile");
        }else {
            System.out.println("Error");
        }
    }
}
