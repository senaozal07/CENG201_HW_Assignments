public class DischargeStack {
    private Node3 head;

    DischargeStack() {
        head = null;
    }

    public void push(DischargeRecord record) {
        Node3 newNode = new Node3(record);
        newNode.next = head;
        if(head != null) {
            head.prev = newNode;       // update head because new node added
        }
        head = newNode;
    }

    public DischargeRecord pop() {
        if(head == null) {       // the stack is empty
            System.out.println("empty");
            return null;
        }
        DischargeRecord val = head.data;
        head = head.next;     //update head because first node removed
        if(head != null) {
            head.prev = null;   //delete the connect to delete node
        }
        return val;
    }

    public DischargeRecord peek() {
        if(head == null) {    //list is empty
            System.out.println("empty");
            return null;
        }
        return head.data;   //this shows us the head
    }

    public void printStack() {
        if(head == null) {      //stack is empty
            System.out.println("empty");
            return;
        }
        System.out.println("Head to tail.");
        Node3 temp = head;     //start from the top
        while(temp != null) {
            System.out.println(temp.data);     //show the data
            if(temp.next != null) {
                System.out.println("-->");
            }
            temp = temp.next;       //we are searching the Stack and shows us the whole Stack
        }
        System.out.println();
    }
}
