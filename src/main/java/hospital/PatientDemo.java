package hospital;

import java.time.LocalDate;

public class PatientDemo {
    public static void main(String[] args) {
        Address address1 = new Address(2363, "Vinnitsa", "Kolova", 8);
        Address address2 = new Address(8910, "Pelin", "Pulina", 23);
        Address address3 = new Address(9588, "Meren", "Lamanova", 55);
        Address address4 = new Address(2546, "Kalan", "Kelina", 14);

        Diagnosis diagnosis1 = new Diagnosis(4, "Popa");
        Diagnosis diagnosis2 = new Diagnosis(7, "Kopa");
        Diagnosis diagnosis3 = new Diagnosis(2, "lola");
        Diagnosis diagnosis4 = new Diagnosis(3, "Polo");

        LocalDate localDate1 = LocalDate.of(2023,8,10);
        LocalDate localDate2 = LocalDate.of(2022,5,24);
        LocalDate localDate3 = LocalDate.of(2023,3,30);
        LocalDate localDate4 = LocalDate.of(2023,1,7);

        Therapist therapist1 = new Therapist(1,"Pepen", "Gladen", address1, "Yrolog");
        Therapist therapist2 = new Therapist(2,"Luca", "Xaxana", address2, "Okylist");
        Therapist therapist3 = new Therapist(3,"Alla", "Mulala", address3, "Stamatolag");
        Therapist therapist4 = new Therapist(4,"Meja", "Kikila", address4, "Psihiatr");


        Patient patient1 = new Patient(1,"Max", "Lemens", address1, 2598, diagnosis1, localDate1, therapist1);
        Patient patient2 = new Patient(2,"Kil", "Pupp", address2, 9865, diagnosis2, localDate2, therapist2);
        Patient patient3 = new Patient(3,"lel", "Lakoka", address3, 3232, diagnosis3, localDate3, therapist3);
        Patient patient4 = new Patient(4,"Xex", "Monoma", address4, 1326, diagnosis4, localDate4, therapist4);

        Patient[] patients = {patient1,patient2,patient3,patient4};

        HospitalService service = new HospitalService(patients);

        service.showAllPatients();
        System.out.println("--------------------------------");
        service.showPatientsByCity("Pelin");
        System.out.println("--------------------------------");
        service.showPatientsByDate(LocalDate.ofEpochDay(30));
        System.out.println("--------------------------------");
        System.out.println(service.findPatientById(4));
        System.out.println("--------------------------------");
        System.out.println(service.findPatientByCard(3));
        System.out.println("--------------------------------");
        service.showPatientsByDiagnosis(7);
        System.out.println("--------------------------------");
        service.showPatientsByTherapist(1);

    }
}
