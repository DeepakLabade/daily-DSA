public class ReverseDLL {

    static Node head = null;

    void print() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.back = temp;
    }

    void Reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = null;
        Node curr = head;
        while (curr != null) {
            temp = curr.back;
            curr.back = curr.next;
            curr.next = temp;
            curr = curr.back;
        }
        head = temp.back;
        }

    public static void main(String[] args) {
        ReverseDLL ll = new ReverseDLL();
        ll.add(4);
        ll.add(3);
        ll.add(39);
        ll.Reverse();
        ll.print();
    }
}

class Node {
    int data;
    Node next;
    Node back;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}