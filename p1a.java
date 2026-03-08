import java.util.Scanner;

//Pembuatan objek class mahasiswa dengan atribut private
class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;
    private String status;
    private String predikat;

    Mahasiswa(String nama, String nim, String jurusan, double ipk){
        this.nama = nama;
        this.nim = nim; 
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
//Getter untuk NIM dikarenakan akan ada pencarian untuk pengubahan IPK
    String getNim(){
        return nim;
    }

    void tampilkanInfo(){
        System.out.println("Nama: " + nama );
        System.out.println("Nim: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + status);
        System.out.println("predikat: " + predikat + "\n");
    }
//Metode untuk cek kelulusan
    void cekKelulusan(){
        if (ipk >= 3.0){
            status = "Lulus";
        }else{ 
            status = "Tidak lulus";
        }
    }
//Metode untuk hitung predikat
    void hitungPredikat(){
        if (ipk >= 3.75){
            predikat = "Dengan Pujian";
        } else if (ipk >= 3.50){
            predikat = "Sangat Memuaskan";
        } else if (ipk >= 3.00){
            predikat = "Memuaskan";
        } else {
            predikat = "Perlu perbaikan";
        }
    }
//Metode update ipk
    void updateIpk(double ipkBaru){
        this.ipk = ipkBaru;
        cekKelulusan();
        hitungPredikat();
        System.out.println("Data berhasil di update");
    }
}

public class p1a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Data Mahasiswa ===");
        Mahasiswa[] daftarMahasiswa = {
                new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75),
                new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40),
                new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90),
                new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00),
                new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20),
        };
//Menampilkan informasi mengenai data mahasiswa yang sudah terdaftar
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            daftarMahasiswa[i].cekKelulusan();
            daftarMahasiswa[i].hitungPredikat();
            daftarMahasiswa[i].tampilkanInfo();
        }
//Metode pembaharuan ipk pada mahasiswa dengan melakukan searching nim terlebih dahulu
//Jika user memasukan input nim yang tidak terdaftar akan langsung diberikan notifikasi
        boolean ditemukan = false;

        System.out.println("Masukan Nim mahasiswa yang akan diupdate: ");
        String nimCari = input.nextLine();

        System.out.println("Masukan IPK baru: ");
        double ipkBaru = input.nextDouble();

        for(int i=0; i < daftarMahasiswa.length; i++){
            if(daftarMahasiswa[i].getNim().equals(nimCari)){
                daftarMahasiswa[i].updateIpk(ipkBaru);
                ditemukan = true;
            }
        }
        if(!ditemukan){
            System.out.println("NIM tidak ditemukan");
        }
        System.out.println("===Data mahasiswa setelah diupdate===");

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            daftarMahasiswa[i].tampilkanInfo();
        }
//Tidak lupa untuk close input setelah scanner digunakan
        input.close();
    }

}
