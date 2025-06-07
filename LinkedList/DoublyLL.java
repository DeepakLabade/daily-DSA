public class DoublyLL {

    static Node head;

    void add(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        Node prev = head;
        while (prev.next != null) {
            prev = prev.next;
        }
            prev.next = temp;
            temp.next = null;
            temp.back = prev;
    }
    
    void print() {
        Node temp = head;
        if (temp == null) {
            System.out.print("null");
        }
        System.out.println("started" + temp.data);
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.add(5);
        ll.add(2);
        ll.add(19);
        ll.print();
        System.out.println("done");
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