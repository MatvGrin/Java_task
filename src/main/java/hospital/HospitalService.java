package hospital;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class HospitalService {
    private Patient[] patients;


    public HospitalService(Patient[] patients) {
        this.patients = patients;
    }

    public void showAllPatients(){
        Arrays.sort(patients);
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void showPatientsByCity(String city){
        for (Patient patient : patients) {
            if (Objects.equals(patient.getAddress().getCityName().toUpperCase(), city.toUpperCase())){
                System.out.println(patient);
            }
        }
    }

    public void showPatientsByDate(LocalDate date){
        for (Patient patient : patients) {
            if (Objects.equals(patient.getLastVisitDate(), date)){
                System.out.println(patient);
            }
        }
    }

    public Patient findPatientById(long id){
        for (Patient patient : patients) {
            if (patient.getId() == id){
                return patient;
            }
        }
        return null;
    }

    public Patient findPatientByCard(long medCardId){
        for (Patient patient : patients) {
            if (patient.getTherapist().getId() == medCardId){
                return patient;
            }
        }
        return null;
    }

    public void showPatientsByDiagnosis(long diagnosisId){
        for (Patient patient : patients) {
            if (patient.getDiagnosis().getDiagnosisId() == diagnosisId){
                System.out.println(patient);
            }
        }
    }

    public void showPatientsByTherapist(long therapistId){
        for (Patient patient : patients) {
            if (patient.getTherapist().getId() == therapistId){
                System.out.println(patient);
            }
        }
    }


}
