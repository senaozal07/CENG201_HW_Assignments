public class DischargeRecord {
    private int patientId;
    private long dischargeTime;

    public DischargeRecord(int patientId) {
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }
    public int getPatientId() {
        return patientId;
    }
    public long getDischargeTime() {
        return dischargeTime;
    }
}
