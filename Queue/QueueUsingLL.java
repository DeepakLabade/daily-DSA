package Queue;

public class QueueUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node front = null;
        static Node rear = null;
        
        public static boolean isEmpty() {
            if(front == null) {
                return true;
            }
            return false;
        }

        public static void enque(int data) {
            Node newNode = new Node(data);
            if(front == null || rear == null) {
                front = rear = newNode;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public static int peek() {
            if(front == null) {
                return -1;
            }
            return front.data;
        }

        public static int dequeue() {
            if(front == null) {
                return -1;
            }
            if(front == rear) {
                front = rear = null;
            } 
            int removedItem = front.data;
            front = front.next;
            return removedItem;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
