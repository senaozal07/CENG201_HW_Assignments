public class Main {
    public static void main(String[] args) {

        //TASK1 Test Scenario
        PatientList line = new PatientList();

        line.addPatient(new Patient(0,"Zümra",1,20));
        line.addPatient(new Patient(1,"Begüm",2,21));
        line.addPatient(new Patient(2,"Birce",3,20));
        line.addPatient(new Patient(3,"Mina",4,22));
        line.addPatient(new Patient(4,"Lina",5,17));

        System.out.println("line");
        line.printList();
        line.removePatient(4);
        line.findPatient(2);
        System.out.println("new line");
        line.printList();
        System.out.println("----------------------------");


        //TASK2 Test Scenario
        TreatmentQueue line2 = new TreatmentQueue();

        line2.enqueue(new TreatmentRequest(1));
        line2.enqueue(new TreatmentRequest(2));
        line2.enqueue(new TreatmentRequest(3));
        line2.enqueue(new TreatmentRequest(4));
        line2.enqueue(new TreatmentRequest(5));
        line2.enqueue(new TreatmentRequest(6));
        line2.enqueue(new TreatmentRequest(7));
        line2.enqueue(new TreatmentRequest(8));

        line2.dequeue();
        line2.dequeue();
        line2.dequeue();

        System.out.println("Queue size is: " + line2.size());


        System.out.println("Remaining Queue is: ");
        line2.printQueue();
        System.out.println("---------------------------");



        //TASK3 Test Scenario
        DischargeStack line3 = new DischargeStack();

        line3.push(new DischargeRecord(1));
        line3.push(new DischargeRecord(2));
        line3.push(new DischargeRecord(3));
        line3.push(new DischargeRecord(4));
        line3.push(new DischargeRecord(5));

        line3.pop();
        line3.pop();


        System.out.println("Remaining Stack is: ");
        line3.printStack();
        System.out.println("----------------------------");






    }
}
