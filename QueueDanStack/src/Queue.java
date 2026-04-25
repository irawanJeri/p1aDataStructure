public class Queue {
    Node front, rear;

    void enqueue (String kode, String nama, int jumlah) {
        Node newNode = new Node(kode, nama, jumlah);
        if (rear == null) {

            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    Node dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return null;
        }
        Node temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp;
    }

    void display() {
        Node temp = front;

        while (temp != null) {
            System.out.println(temp.kode + " | " + temp.nama + " | " + temp.jumlah);
            temp = temp.next;
        }
    }
}
