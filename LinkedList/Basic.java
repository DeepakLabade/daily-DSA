public class Basic {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    private static Node convertingArrToLL(int[] arr)  {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    
    public static void printLL(Node head) {
        System.err.println("printing a Linked List");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static int lenOfLL(Node head) {
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static boolean searchInLL(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(convertingArrToLL(arr).data);
        Node head = convertingArrToLL(arr);
        printLL(head);
        System.err.println(lenOfLL(head));
        System.out.println(searchInLL(head, 6));
    }
}