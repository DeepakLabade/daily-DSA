//Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

//Example 1:
//Input: head = [1,2,3,4]
//Output: [2,1,4,3]


public class SwapNodesInPair {
    static Node head=null;

    public static Node swapPairs() {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Node prev;
        Node demo;
        head = temp.next;

        prev = temp.next;
        temp.next = temp.next.next;
        prev.next = temp;
        demo = temp;
        temp = temp.next;

        while (temp != null && temp.next != null) {
            prev = temp.next;
            temp.next = temp.next.next;
            prev.next = temp;
            demo.next = prev;
            demo = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void arrToLL(int arr[]) {
        Node newNode = new Node(0);
        head = newNode;
        Node temp = head;
        for (int i = 0; i < arr.length; i++) {
            newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
    }

    public static void print() {
        Node temp = head;
        while (temp != null && temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        arrToLL(arr);
        print();
        swapPairs();
        print();
        
    }   
}
