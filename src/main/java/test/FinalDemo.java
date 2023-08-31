package test;

public class FinalDemo {
    public static void main(String[] args) {
        Bird peng1 = new Bird(10);
        peng1.setFly(false);
        System.out.println(peng1.isFly());
        peng1.sey();

        Penguin penguin1 = new Penguin();

        penguin1.sey();

        Bird.isAge();

        Bird bird = new Bird(10);
    }
}
