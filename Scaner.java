public class Scaner importimport java.util.InputMismatchException;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka1 = 0, angka2 = 0;

        try {
            // Mengambil input angka pertama
            System.out.print("Masukkan angka pertama: ");
            angka1 = scanner.nextInt();

            // Mengambil input angka kedua
            System.out.print("Masukkan angka kedua: ");
            angka2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Harap masukkan angka.");
            scanner.next(); // Clear the invalid input
            return; // Exit the program
        }

        // Menentukan nilai yang lebih besar di antara angka1 dan angka2
        int nilaiTerbesar = (angka1 > angka2) ? angka1 : angka2;

        // Menampilkan hasil dengan format yang lebih menarik
        System.out.println("====================================");
        System.out.println("Angka yang Anda masukkan:");
        System.out.println("Angka pertama: " + angka1);
        System.out.println("Angka kedua: " + angka2);
        System.out.println("Nilai yang paling besar adalah: " + nilaiTerbesar);
        System.out.println("====================================");

        // Menutup scanner untuk mencegah kebocoran sumber daya
        scanner.close();
    }
}{
}
