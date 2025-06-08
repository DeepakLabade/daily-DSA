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
    
    void deleteHead() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
        head.back = temp;
    }

    void deleteTail() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.back = null;
        temp.next = null;
    }

    void deleteKth(int k) {
        if (head == null) {
            return;
        }
        int cnt = 1;
        Node temp = head;
        while (cnt != k) {
            cnt++;
            temp = temp.next;
        }
        if (cnt < k) {
            return;
        }
        temp.back.next = temp.next;
        temp.next.back = temp.back;
        temp.back = null;
        temp.next = null;
    }

    void addHead(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        }
        temp.back = null;
        temp.next = head;
        head.back = temp;
        head = temp;
    }

    void addTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.back;
        prev.next = newNode;
        newNode.next = temp;
        temp.back = newNode;
        newNode.back = prev;
    }

    void addAtK(int data, int k) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        int cnt = 1;
        Node temp = head;
        while (temp.next != null) {
            cnt++;
            temp = temp.next;
            if (cnt == k)
                break;
        }
        Node prev = temp.back;
        prev.next = newNode;
        newNode.next = temp;
        temp.back = newNode;
        newNode.back = prev;
    }
    
    void print() {
        Node temp = head;
        if (temp == null) {
            System.out.print("null");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.add(5);
        ll.add(2);
        ll.add(19);
        ll.add(16);
        ll.add(14);
        ll.addAtK(29, 2);
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