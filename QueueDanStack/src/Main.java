import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue();
        Stack stack = new Stack();

        int pilihan;

        do {
            System.out.println("\n=== Sistem Kasir Toko ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode: ");
                    String kode = input.nextLine();

                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan jumlah: ");
                    int jumlah = input.nextInt();

                    queue.enqueue(kode, nama, jumlah);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    Node keluar = queue.dequeue();
                    stack.push(keluar);
                    System.out.println("Transaksi disimpan ke riwayat");
                    break;

                case 3:
                    System.out.println("Isi Antrian:");
                    queue.display();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}
