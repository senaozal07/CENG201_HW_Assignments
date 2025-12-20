public class HospitalSystem {
    PatientList patientList;
    TreatmentQueue treatmentQueue;
    DischargeStack dischargeStack;
    java.util.HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new java.util.HashMap<Integer, Patient>();
    }

    public void addPatient(Patient patient) {
        patientList.addPatient(patient);
        patientMap.put(patient.id, patient);
    }

    public void addTreatmentRequest(int patientId, boolean priority) {
        treatmentQueue.enqueue(new TreatmentRequest(patientId, priority));
    }

    public void addDischargeRecord(int patientId) {
        dischargeStack.push(new DischargeRecord(patientId));
    }

    public void processTreatmentRequest() {
        TreatmentRequest request = treatmentQueue.dequeue();
        if(request == null) {
            System.out.println("No treatment request to process.");
            return;
        }
        System.out.println("Processing treatment for patient: " + request.patientId + "(priority: " + request.priority +  ")");
        dischargeStack.push(new DischargeRecord(request.patientId));
    }

    public void sortPatientsBySeverityDesc() {
        Patient[] arr = toArrayFromMap();
        if(arr == null) {
            return;
        }
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j< arr.length-1; j++) {
                if(arr[j].severity < arr[j+1].severity) {
                    Patient temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nPatient Sorted By Severity (Descending): ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private Patient[] toArrayFromMap() {
        if(patientMap.size() == 0) {
            return null;
        }
        Patient[] arr = new Patient[patientMap.size()];
        int idx =0;
        for(Integer key: patientMap.keySet()) {
            arr[idx] = patientMap.get(key);
            idx++;
        }
        return arr;
    }

    public void printSystemState() {
        System.out.println("\n CURRENT SYSTEM STATE");

        System.out.println("\nPatient List (LinkedList) ");
        patientList.printList();

        System.out.println("\nTreatment Queue (Priority then Normal)");
        treatmentQueue.printQueue();

        System.out.println("\nDischarge Stack (LIFO)");
        dischargeStack.printStack();
    }
}
