package Queue;

public class QueueUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void enque(int data) {
            if(rear == size-1) {
                System.out.println("the queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        public int peek() {
            if(rear == -1) {
                System.out.println("the queue is empty");
                return -1;
            }

            return arr[0];
        }

        public int remove() {
            if(rear == -1) {
                System.out.println("the queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
