package hospital;

public class Therapist {
    //Створити класс Therapist: id, name, surname, address (адреса), speciality (спеціальність).

    private int id;
    private String name;
    private String surname;
    private Address address;
    private String speciality;


    public Therapist(int id, String name, String surname, Address address, String speciality) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
