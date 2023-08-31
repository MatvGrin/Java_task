package hospital;

public class Diagnosis {
    //Створити класс Diagnosis: diagnosis id (Long), description(String).

    private long diagnosisId;
    private String description;


    public Diagnosis(long diagnosisId, String description) {
        this.diagnosisId = diagnosisId;
        this.description = description;
    }

    public long getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(long diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "diagnosisId=" + diagnosisId +
                ", description='" + description + '\'' +
                '}';
    }
}
