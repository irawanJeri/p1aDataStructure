public class Node {
    String kode;
    String nama;
    int jumlah;
    Node next;

    Node(String kode, String nama, int jumlah){
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.next = null;
    }
}
