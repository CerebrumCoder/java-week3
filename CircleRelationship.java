import java.util.Scanner;

public class CircleRelationship {
    // Method untuk menghitung jarak antara dua titik (x1, y1) dan (x2, y2)
public static double computeDistance(double x1, double y1, double x2, double y2) {
    // TODO: lakukan perhitungan jarak kedua titik pusat
    double first_term = Math.pow(x2 - x1, 2);
    double second_term = Math.pow(y2 - y1, 2);
    double final_term = first_term + second_term;

    double result = Math.sqrt(final_term);

    return result;


}

    // Method untuk menentukan hubungan antara dua lingkaran
public static String determineRelationship(double x1, double y1, double r1, double x2, double y2, double r2) {
    // Menggunakan method computeDistance untuk mendapatkan jarak antara pusat lingkaran
    double distance = computeDistance(x1, y1, x2, y2);
    if (distance > r1 + r2) {
        return "Lingkaran terpisah.";
    } else if (distance == r1 + r2) {
        return "Lingkaran bersentuhan secara eksternal.";
    } else if (distance < Math.abs(r1 - r2)) {
        return "Salah satu lingkaran berada di dalam lingkaran lainnya.";
    } else if (distance == Math.abs(r1 - r2)) {
        return "Lingkaran bersentuhan secara internal.";
    } else {
        return "Lingkaran beririsan.";
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input data untuk lingkaran pertama
        System.out.println("Masukkan data untuk lingkaran pertama:");
        System.out.print("Masukkan koordinat x: ");
        double x1 = scanner.nextDouble();
        System.out.print("Masukkan koordinat y: ");
        double y1 = scanner.nextDouble();
        System.out.print("Masukkan jari-jari: ");
        double r1 = scanner.nextDouble();
        // Input data untuk lingkaran kedua
        System.out.println("Masukkan data untuk lingkaran kedua:");
        System.out.print("Masukkan koordinat x: ");
        double x2 = scanner.nextDouble();
        System.out.print("Masukkan koordinat y: ");
        double y2 = scanner.nextDouble();
        System.out.print("Masukkan jari-jari: ");
        double r2 = scanner.nextDouble();
        // Panggil method untuk menentukan hubungan kedua lingkaran
        String relationship = determineRelationship(x1, y1, r1, x2, y2, r2);
        System.out.println("Hasil: " + relationship);
    }
}