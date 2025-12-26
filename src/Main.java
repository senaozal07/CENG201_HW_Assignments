public class Main {
    public static void main(String[] args) {

        //TASK1 Test Scenario
        PatientList line = new PatientList();

        //adding patients
        line.addPatient(new Patient(0,"Zümra",1,20));
        line.addPatient(new Patient(1,"Begüm",2,21));
        line.addPatient(new Patient(2,"Birce",3,20));
        line.addPatient(new Patient(3,"Mina",4,22));
        line.addPatient(new Patient(4,"Lina",5,17));



        System.out.println("-----------TASK 1-------------");

        //testing printlist
        System.out.println("line");
        line.printList();


        //removing patients
        line.removePatient(4);

        //finding patient
        line.findPatient(2);


        //print the last version
        System.out.println("new line");
        line.printList();
        System.out.println("-------------TASK 2---------------");


        //TASK2 Test Scenario
        TreatmentQueue line2 = new TreatmentQueue();

        //adding patients
        line2.enqueue(new TreatmentRequest(1,true));
        line2.enqueue(new TreatmentRequest(2,false));
        line2.enqueue(new TreatmentRequest(3,true));
        line2.enqueue(new TreatmentRequest(4,false));
        line2.enqueue(new TreatmentRequest(5,true));
        line2.enqueue(new TreatmentRequest(6,true));
        line2.enqueue(new TreatmentRequest(7,false));
        line2.enqueue(new TreatmentRequest(8,false));


        //removing patients
        line2.dequeue();
        line2.dequeue();
        line2.dequeue();

        //show size
        System.out.println("Queue size is: " + line2.size());

        //show queue
        System.out.println("Remaining Queue is: ");
        line2.printQueue();
        System.out.println("------------TASK3---------------");



        //TASK3 Test Scenario
        DischargeStack line3 = new DischargeStack();

        //adding patients
        line3.push(new DischargeRecord(1));
        line3.push(new DischargeRecord(2));
        line3.push(new DischargeRecord(3));
        line3.push(new DischargeRecord(4));
        line3.push(new DischargeRecord(5));


        //removing patients
        line3.pop();
        line3.pop();

        //show stack
        System.out.println("Remaining Stack is: ");
        line3.printStack();
        System.out.println("-------------TASK 4---------------");




        //TASK4 Test Scenario
        HospitalSystem line4 = new HospitalSystem();


        //adding patients
        line4.addPatient(new Patient(1,"Sena",5,21));
        line4.addPatient(new Patient(2,"Mina",2,22));
        line4.addPatient(new Patient(3,"Lina",1,18));
        line4.addPatient(new Patient(4,"Birce",4,20));
        line4.addPatient(new Patient(5,"Begüm",6,22));
        line4.addPatient(new Patient(6,"Zümra",9,21));
        line4.addPatient(new Patient(7,"Ceren",4,21));
        line4.addPatient(new Patient(8,"Sudem",3,21));
        line4.addPatient(new Patient(9,"Zeynep",8,21));
        line4.addPatient(new Patient(10,"Selenay",7,21));


        //adding normal
        line4.addTreatmentRequest(2,false);
        line4.addTreatmentRequest(4,false);
        line4.addTreatmentRequest(7,false);
        line4.addTreatmentRequest(9,false);
        line4.addTreatmentRequest(10,false);


        //adding priority
        line4.addTreatmentRequest(1,true);
        line4.addTreatmentRequest(6,true);
        line4.addTreatmentRequest(3,true);


        //adding discharge
        line4.addDischargeRecord(5);
        line4.addDischargeRecord(8);


        //process treatment
        line4.processTreatmentRequest();
        line4.processTreatmentRequest();


        //sorting by severity
        line4.sortPatientsBySeverityDesc();


        //print final state
        line4.printSystemState();
    }
}
