public class TreatmentRequest {
    private int patientId;
    private long arrivalTime;

    public TreatmentRequest(int patientId) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
    }

    public int getPatientId() {
        return patientId;
    }
    public long getArrivalTime() {
        return arrivalTime;
    }
}