public class TreatmentQueue {
    private Node2 head;
    private Node2 tail;
    private int size;

    public TreatmentQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(TreatmentRequest data) {
        Node2 newNode = new Node2(data);

        if(tail == null) {   //first node add
            head = tail = newNode;
        }else {
            tail.next  = newNode;
            tail = newNode;
        }
        size++;   //we are increasing the size
    }

    public TreatmentRequest dequeue() {
        if(head == null) {
            return null;   // list is empty
        }
        TreatmentRequest val = head.data;    //take the info first
        head = head.next;
        size--;      //we are decreasing the size
        return val;
    }

    public int size() {
        return size;    //shows us the size
    }

    public void printQueue() {
        Node2 current = head;

        while(current != null) {
            System.out.println(current.data);
            if(current == head){
                System.out.println("Front");
            }
            if(current.next != null) {
                System.out.println("-->");
            }
            current = current.next;     //we are searching and showing the whole Queue
        }
        System.out.println();
    }
}
