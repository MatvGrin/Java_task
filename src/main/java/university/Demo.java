package university;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Vasia", "Pupkov", LocalDate.of(2005, 5, 7), "Ferulla, 5", "+3806712345678", "ElectroTech", 1, "LT-25");
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Ura");
        student2.setSurname("Plutoshko");
        student2.setBirthDate(LocalDate.of(2003, 9, 15));
        student2.setPhoneNumber("+380501111111");
        student2.setAddress("Korolenko, 35");
        student2.setFaculty("Computer science");
        student2.setCourse(3);
        student2.setGroup("CO-11");

        int id = student1.getId();
        System.out.println(id);
        String group = student1.getGroup();
        System.out.println(group);

        String s = student2.showNameAndSurname();
        System.out.println(s);
        String s1 = student2.showAddressAndPhone();
        System.out.println(s1);
        String s2 = student2.showUniversityData();
        System.out.println(s2);
        System.out.println(student2.showAge());
        System.out.println(student1);
        System.out.println(student2);
    }
}
