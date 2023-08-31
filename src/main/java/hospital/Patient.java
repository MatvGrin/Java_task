package hospital;

import java.time.LocalDate;

public class Patient {
    //: id, name, surname, address (адреса), medical card number (номер медичної карти), diagnosis (діагноз),
    //last visit date (дата останнього візиту)(використовувати класс LocalDate), therapist (лікуючий лікар).
    private int id;
    private String name;
    private String surname;
    private Address address;//-----------
    private int medicalCardNumber;
    private Diagnosis diagnosis;//---------------
    private LocalDate lastVisitDate;
    private Therapist therapist;//---------------


    public Patient(int id, String name, String surname, Address address, int medicalCardNumber, Diagnosis diagnosis, LocalDate lastVisitDate, Therapist therapist) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
        this.lastVisitDate = lastVisitDate;
        this.therapist = therapist;
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

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDate getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(LocalDate lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public Therapist getTherapist() {
        return therapist;
    }

    public void setTherapist(Therapist therapist) {
        this.therapist = therapist;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", medicalCardNumber=" + medicalCardNumber +
                ", diagnosis=" + diagnosis +
                ", lastVisitDate=" + lastVisitDate +
                ", therapist=" + therapist +
                '}';
    }

}
