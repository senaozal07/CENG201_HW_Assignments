public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean priority;


    public TreatmentRequest(int patientId,boolean priority)  {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
        this.priority = priority;

    }

    //write all get method
    public int getPatientId() {
        return patientId;
    }
    public long getArrivalTime() {
        return arrivalTime;
    }
    public String toString() {
        return "Patient: " + patientId + " Time: " + arrivalTime;
    }
}