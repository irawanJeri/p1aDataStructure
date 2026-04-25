import java.util.Scanner;

public class SingleLinkListMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int pilihan;

        do {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua");
            System.out.println("3. Cari Buku");
            System.out.println("4. Hapus Buku Terakhir di Daftar");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Buku : ");
                    String kodeBuku = input.nextLine();

                    System.out.print("Judul     : ");
                    String judul = input.nextLine();

                    System.out.print("Penulis   : ");
                    String penulis = input.nextLine();

                    list.insert(kodeBuku, judul, penulis);
                    System.out.println("Buku berhasil ditambahkan!");
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    System.out.print("Masukkan judul yang dicari: ");
                    String cari = input.nextLine();
                    list.cari(cari);
                    break;

                case 4:
                    list.delete();
                    System.out.println("Buku terakhir berhasil di hapus !");
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }
}
