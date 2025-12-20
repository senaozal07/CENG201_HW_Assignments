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

        if(request.priority) {     //if there is a priority.
            if(priorityhead == null) {
                priorityhead = prioritytail = newNode;   //if our queue is empty
            } else {
                prioritytail.next = newNode;   //add node to the end
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
        //this is for if there is a priority patient
        if(priorityhead != null) {
            TreatmentRequest value = priorityhead.data;   // take the first data
            priorityhead = priorityhead.next;
            if(priorityhead == null) {  //the queue is empty
                prioritytail = null;
            }
            size--;     //decreasing the size
            return value;
        }
        if(head != null) {
            TreatmentRequest value = head.data;    //take the first info
            head = head.next;
            if (head == null) {   // if there is no head we must empty the tail
                tail = null;
            }
            size--;    //decreasing the size
            return value;
        }
        return null;  // if both of them are null
    }

    public int size() {
        return size;    //shows us the size
    }

    public void printQueue() {
        System.out.println("Priority Queue: ");
        Node2 current = priorityhead;  // we start the output from the top

        if(current == null) {
            System.out.println("empty");
        } else {
            while(current != null) {
                System.out.println("Patient: " + current.data.patientId);    //output the all patient's ıd
                current = current.next;
            }
        }

        System.out.println("Normal Qeueu: ");
        current = head;

        if(current == null) {      //the queue is empty
            System.out.println("empty");
        }else {
            while(current != null) {
            System.out.println(current.data);   //show the data
            if (current.next != null) {
                System.out.println("-->");
            }
            current = current.next;      //we are searching and showing the whole Queue
            }
        }
        System.out.println();
    }
}
