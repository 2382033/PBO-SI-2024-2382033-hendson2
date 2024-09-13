import java.util.Scanner;

public class IFStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Perbaikan deklarasi Scanner

        int nomorHari;
        System.out.print("Masukkan nomor diantara 1 sampai 7: ");
        nomorHari = scanner.nextInt();
        String namaHari = "";

        if (nomorHari == 1) {  // Perbaikan tanda kurung
            namaHari = "Minggu";
        } else if (nomorHari == 2) {
            namaHari = "Senin";
        } else if (nomorHari == 3) {
            namaHari = "Selasa";
        } else if (nomorHari == 4) {
            namaHari = "Rabu";
        } else if (nomorHari == 5) {
            namaHari = "Kamis";
        } else if (nomorHari == 6) {
            namaHari = "Jumat";
        } else if (nomorHari == 7) {
            namaHari = "Sabtu";
        } else {
            System.out.println("Masukkan nomor diantara 1 sampai 7");
            System.exit(0);  // Perbaikan pada System.exit()
        }

        System.out.println("Hari: " + namaHari);  // Tambahkan untuk menampilkan hasil
    }
}