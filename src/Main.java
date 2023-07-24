import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input untuk pengguna/ untuk pengguna memasukkan jari-jari lingkaran
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        float radius = scanner.nextFloat();

        // menghitung luas & keliling lingkaran dengan fungsi hitungLuasLingkaran & hitungKelilingLingkaran dari lingkaran
        double luas = hitungLuasLingkaran(radius);
        double keliling = hitungKelilingLingkaran(radius);

        // menampilkan untuk hasil perhitungan luas dan keliling lingkaran dengan format dua angka dibelakang koma dengan print format
        System.out.printf("Luas lingkaran: %.2f%n", luas);
        System.out.printf("Keliling lingkaran: %.2f%n", keliling);
    }

    // fungsi untuk menghitung luas lingkaran
    public static double hitungLuasLingkaran(float radius) {
        return Math.PI * radius * radius;
    }

    // fungsi untuk menghitung keliling lingkaran
    public static double hitungKelilingLingkaran(float radius) {
        return 2 * Math.PI * radius;
    }
}
