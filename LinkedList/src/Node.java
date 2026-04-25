class Node {
    String kodeBuku;
    String judulBuku;
    String penulis;
    Node next;

    Node (String kodeBuku, String judulBuku, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.next = null;
    }
}
