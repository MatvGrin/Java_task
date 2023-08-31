package hospital;

public class Therapist extends Person {
    //Створити класс Therapist: id, name, surname, address (адреса), speciality (спеціальність).

    private String speciality;

    public Therapist(int id, String name, String surname, Address address, String speciality) {
        super(id, name, surname, address);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Therapist{" +
                "speciality='" + speciality + '\'' +
                '}';
    }

}
