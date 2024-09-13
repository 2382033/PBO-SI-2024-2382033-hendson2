public class TernaryOperator {
    public static void main(String[] args) {
        int nilaiLulusMinimum = 70;
        int nilaiMahasiswa = 60;

        // Menggunakan Ternary Operator
        String hasil = nilaiMahasiswa >= nilaiLulusMinimum ? "Lulus" : "Tidak Lulus";

        System.out.println("Hasil: " + hasil);

        // Alternatif dengan if-else
        if (nilaiMahasiswa >= nilaiLulusMinimum) {
            hasil = "Lulus";
        } else {
            hasil = "Tidak Lulus";
        }

        System.out.println("Hasil dengan if-else: " + hasil);
    }
}