package hospital;

import java.time.LocalDate;

public class Patient extends Person {
    //: id, name, surname, address (адреса), medical card number (номер медичної карти), diagnosis (діагноз),
    //last visit date (дата останнього візиту)(використовувати класс LocalDate), therapist (лікуючий лікар).
    private int medicalCardNumber;
    private Diagnosis diagnosis;//---------------
    private LocalDate lastVisitDate;
    private Therapist therapist;//---------------


    public Patient(int id, String name, String surname, Address address, int medicalCardNumber, Diagnosis diagnosis, LocalDate lastVisitDate, Therapist therapist) {
        super(id, name, surname, address);
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
        this.lastVisitDate = lastVisitDate;
        this.therapist = therapist;
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
}
