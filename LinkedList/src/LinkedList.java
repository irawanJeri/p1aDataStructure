public class LinkedList {
    Node head;

    void insert(String kodeBuku, String judulBuku, String penulis){
        Node newNode = new Node(kodeBuku, judulBuku, penulis);
        if (head == null){
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void display() {
        Node temp = head;
        System.out.println("====DATA BUKU====");
        while (temp != null){
            System.out.printf("Kode buku \t: %s\nJudul buku\t: %s\nPenulis\t\t: %s\n\n", temp.kodeBuku, temp.judulBuku, temp.penulis);
            temp = temp.next;
        }
    }
    void delete() {
        if (head == null) return;
        if (head.next == null) return;

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void cari(String kodeBuku) {
        Node temp = head;
        boolean ditemukan = false;

        while (temp != null) {
            if (temp.judulBuku.toLowerCase().contains(kodeBuku.toLowerCase())) {
                System.out.println("=== BUKU DITEMUKAN ===");
                System.out.printf("Kode buku \t: %s\nJudul buku\t: %s\nPenulis\t\t: %s\n\n",
                        temp.kodeBuku, temp.judulBuku, temp.penulis);
                ditemukan = true;
            }
            temp = temp.next;
        }

        if (!ditemukan) {
            System.out.println("Buku tidak ditemukan.");
        }
    }
}

