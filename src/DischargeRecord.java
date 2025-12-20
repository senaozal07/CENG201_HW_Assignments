public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }

    //write all get methods
    public int getPatientId() {
        return patientId;
    }
    public long getDischargeTime() {
        return dischargeTime;
    }
    public String toString() {
        return "Discharge Record patient:" + patientId + " Time: " + dischargeTime;
    }
}
