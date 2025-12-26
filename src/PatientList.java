public class PatientList {
    Node head;

    public void addPatient(Patient data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;    //if our list is empty our newNode is will be head.
            return;
        }
        Node trv = head;
        while (trv.next != null) {     // if our list not empty we add newNode like this.
            trv = trv.next;
        }
        trv.next = newNode;
    }

    public void removePatient(int id) {
        //Case 1 if our list is empty.
        if (head == null) {
            return;
        }
        //Case 2 remove from the head.
        if (head.data.id == id) {
            head = head.next;
            return;
        }
        //Case 3 remove from the middle part.
        Node trv = head;
        while (trv.next != null) {
            if (trv.next.data.id == id) {
                trv.next = trv.next.next;
                return;
            }
            trv = trv.next;
        }
    }

    public Patient findPatient(int id) {
        Node trv = head;
        while (trv != null) {   // we are searching who we are looking.
            if (trv.data.id == id) {
                return trv.data;
            }
            trv = trv.next;
        }
        return null;
    }
    public void printList() {
        Node trv = head;
        if (trv == null) {
            System.out.println("There is no one at the line.");    //list is empty.
        }
        while (trv != null) {
            System.out.println(trv.data + " ");
            trv = trv.next;     // this shows us whole list.
        }
        System.out.println();
    }
}
