public class TreatmentQueue {
    private Node2 priorityhead;
    private Node2 prioritytail;
    private Node2 head;
    private Node2 tail;
    private int size;

    public TreatmentQueue() {
        priorityhead = null;
        prioritytail = null;
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(TreatmentRequest request) {
        Node2 newNode = new Node2(request);

        if(request.priority) {
            if(priorityhead == null) {
                priorityhead = prioritytail = newNode;
            } else {
                prioritytail.next = newNode;
                prioritytail = newNode;
            }
        }

        if(tail == null) {   //first node add
            head = tail = newNode;
        }else {
            tail.next  = newNode;
            tail = newNode;
        }
        size++;   //we are increasing the size
    }

    public TreatmentRequest dequeue() {
        if(priorityhead != null) {
            TreatmentRequest value = priorityhead.data;
            priorityhead = priorityhead.next;
            if(priorityhead == null) {
                prioritytail = null;
            }
            return value;
        }
        if(head != null) {
        TreatmentRequest value = head.data;    //take the info first
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return value;
        }
        size--;      //we are decreasing the size
        return null;
    }

    public int size() {
        return size;    //shows us the size
    }

    public void printQueue() {
        System.out.println("Priority Queue: ");
        Node2 current = priorityhead;

        if(current == null) {
            System.out.println("empty");
        } else {
            while(current != null) {
                System.out.println("Patient: " + current.data.patientId);
                current = current.next;
            }
        }

        System.out.println("Normal Qeueu: ");
        current = head;

        if(current == null) {
            System.out.println("empty");
        }else {
            while(current != null) {
            System.out.println(current.data);
            if (current.next != null) {
                System.out.println("-->");
            }
            current = current.next;      //we are searching and showing the whole Queue
            }
        }
        System.out.println();
    }
}
