public class DischargeStack {
    Node3 head;

    DischargeStack() {
        head = null;
    }

    public void push(DischargeRecord data) {
        Node3 newNode = new Node3(data);
        newNode.next = head;
        if(head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public DischargeRecord pop() {
        DischargeRecord val = head.data;
        head = head.next;
        if(head != null) {
            head.prev = null;
        }
        return val;
    }

    public DischargeRecord peek() {
        if(head == null) {
            return null;
        }
        return head.data;
    }

    public void printStack() {
        Node3 temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            if(temp.next != null) {
                System.out.println("-->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
