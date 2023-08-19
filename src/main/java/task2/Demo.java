package task2;

import task3.Student;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Dan");
        student1.setAge(20);
        student2.setName("Marta");
        student2.setAge(22);
        System.out.println(student1.getName() + " " + student1.getAge());
        System.out.println(student2.getName() + " " + student2.getAge());
    }
}
