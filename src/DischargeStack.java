public class DischargeStack {
    Node3 head;

    DischargeStack() {
        head = null;
    }

    public void push(DischargeRecord data) {
        Node3 newNode = new Node3(data);
        newNode.next = head;
        if(head != null) {
            head.prev = newNode;       // update head because new node added
        }
        head = newNode;
    }

    public DischargeRecord pop() {
        DischargeRecord val = head.data;
        head = head.next;     //update head because first node removed
        if(head != null) {
            head.prev = null;   //delete the connect to delete node
        }
        return val;
    }

    public DischargeRecord peek() {
        if(head == null) {   //list is empty
            return null;
        }
        return head.data;   //this shows us the head
    }

    public void printStack() {
        Node3 temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            if(temp.next != null) {
                System.out.println("-->");
            }
            temp = temp.next;       //we are searching the Stack and shows us the whole Stack
        }
        System.out.println();
    }
}
