public class Main {
    public static void main(String[] args) {
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
        line.printList();
    }
}
