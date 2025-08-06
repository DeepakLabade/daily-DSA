public class AddOneToLL {

    public Node reverseLL(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node addOne(Node head) {
        if(head == null) {
            return head;
        }
        Node curr = reverseLL(head);
        int carry = 0;
        Node prev = null;
        curr.data = curr.data + 1;
        while(curr != null) {
            curr.data = curr.data + carry;
            if(curr.data == 10) {
                curr.data = 0;
            }
            carry = curr.data / 10;
            prev = curr;
            curr = curr.next;
        }
        
        Node newhead = reverseLL(prev);
        return newhead;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(4);
        list.append(1);
        list.append(2);
        list.print();
        list.print();
    }
}
