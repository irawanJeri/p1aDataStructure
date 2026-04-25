class Stack {
    Node top;

    void push(Node data) {
        Node newNode = new Node(data.kode, data.nama, data.jumlah);
        newNode.next = top;
        top = newNode;
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.kode + " | " + temp.nama + " | " + temp.jumlah);
            temp = temp.next;
        }

    }
}
