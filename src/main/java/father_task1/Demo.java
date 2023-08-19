package father_task1;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.showNameAndSurname("Albert", "Susanin"));
        System.out.println(student1.showAddressAndPhone("Korolenko 35", 964356887));
        System.out.println(student1.showUniversityData("Tehnology", 3, 89));
        System.out.println(student1.toString(1,"Albert", "Susanin","04.03.08", "Korolenko 35",964356887, "Tehnology", 89,3));
        System.out.println(student1.birth_date("04.03.08"));
    }
}
