class LinkedList {

    Node head;
    Node tail;

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void add(int idx, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // you {can also}/should make a static variable int size to store the size

    int size() {
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public void removeFirst() {
        head = head.next;
    }

    // public boolean rcrSearch(Node node, int target) {
    //     Node temp = node;
    //     if (temp != null) {
    //         return scrSearch(temp, target);
    //     }
    //     return false;
    // }

    void removeMid(int target) {
        Node prev = head;
        for (int i = 1; i < target - 1; i++) {
            prev = prev.next;
        }
        Node temp = prev.next;
        prev.next = temp.next;
    }

    void reverseLL() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(4);
        list.append(1);
        list.append(2);
        list.add(2, 6);
        list.print();
        list.removeMid(3);
        list.print();

    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data; 
        this.next = null;
    }
}