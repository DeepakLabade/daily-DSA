public class isPalindrome {

    Node head = null;

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    Node findMid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("the mid is " + slow.data);
        return slow;
    }
    public static void main(String[] args) {
        isPalindrome list = new isPalindrome();
        list.append(3);
        list.append(4);
        list.append(9);
        list.append(4);
        list.append(10);
        list.append(7);
        list.print();
        list.findMid();
    }
}


class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}