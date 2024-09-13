import java.util.Scanner;

public class tugas1 {
    /**
     * Buatlah sebuah program yang mengambil 2 input number dari user
     * Program tersebut akan print out nilai yang paling besar
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        int nilaiTerbesar = (angka1 > angka2) ? angka1 : angka2;

        System.out.println("Nilai yang paling besar adalah: " + nilaiTerbesar);

        scanner.close();
    }
}