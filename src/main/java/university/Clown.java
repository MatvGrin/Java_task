package university;

public class Clown {

    public static int number = 220;
    public String name;


    public static int divedNumber(int num){
        System.out.println("Vova awesome!!");
        number *= 2;
        Clown clown1 = new Clown();
        clown1.name = "Vova";
//        clown1.surName();
//        super.name = 22;
        return 20;
    }
    public String surName(){
        divedNumber(10);
        return "Anna";
    }

    public static void main(String[] args) {
        Clown klown1 = new Clown();
        Clown klown2 = new Clown();
        klown1.number = 200;
        klown1.divedNumber(20);
        klown2.divedNumber(10);
        System.out.println(klown1.number);
        System.out.println(klown2.number);

        System.out.println(klown1.surName());
        Clown.divedNumber(50);
        System.out.println(Clown.number);
    }

}
