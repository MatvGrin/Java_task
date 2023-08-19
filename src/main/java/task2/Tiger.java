package task2;

public class Tiger extends Animals{
    private int age;

    public void loudSound(){
        System.out.println("Tiger loudly RRRRRRRRRRRRRR!!!");
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String showColor() {
        return "Blue";
    }


}
