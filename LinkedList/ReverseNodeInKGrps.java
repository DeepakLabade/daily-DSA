public class ReverseNodeInKGrps {
    static Node head = null;

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node getKthNode(Node temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public static Node reverseKGroup(int k) {
        Node temp = head;
        Node prevLast = null;

        while (temp != null) {
            Node kThNode = getKthNode(temp, k);
            if (kThNode == null) {
                if (prevLast != null)
                    prevLast.next = temp;
                break;
            }

            Node nextNode = kThNode.next;
            kThNode.next = null;

            Node newHead = reverse(temp);

            if (temp == head) {
                head = newHead;
            } else {
                prevLast.next = newHead;
            }

            prevLast = temp;
            temp = nextNode;
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
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        arrToLL(arr);
        print();
        reverseKGroup(2);
        print();

    }
}
