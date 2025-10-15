import java.util.Scanner;

public class PerhitunganBonusKaryawan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // meminta input dari user untuk nilai kinerja, lama bekerja, gaji pokok, dan sertifikasi
        System.out.print("Nilai kinerja karyawan (1-100)\t\t\t\t\t: ");
        int kinerja = sc.nextInt();
        System.out.print("Lama Bekerja (dalam tahun)\t\t\t\t\t: ");
        double lamaBekerja = sc.nextDouble();
        System.out.print("Gaji Pokok (Rp.)\t\t\t\t\t\t: ");
        double gajiPokok = sc.nextDouble();
        System.out.print("Apakah karyawan memiliki sertifikasi profesional? (ya/tidak)\t: ");
        String sertifikasiInput = sc.next();

        // membuat variabel bonus dengan nilai awal 0
        double bonus = 0;
        // menghitung bonus berdasarkan kinerja, lama bekerja, dan sertifikasi
        // jika kinerja < 70, bonus = 0
        if (kinerja < 70) {
            bonus = 0;
        // jika 70 <= kinerja < 90
        } else if (kinerja >= 70 && kinerja < 90) {
        // jika lama bekerja < 2 tahun, bonus = 1% gaji pokok
        // jika 2 <= lama bekerja < 5 tahun, bonus = 3% gaji pokok
        // jika lama bekerja >= 5 tahun, bonus = 5% gaji pokok
            if (lamaBekerja < 2) {
                bonus = 0.01 * gajiPokok;
            } else if (lamaBekerja < 5) {
                bonus = 0.03 * gajiPokok;
            } else {
                bonus = 0.05 * gajiPokok;
            }
        // jika kinerja >= 90
        // jika lama bekerja < 2 tahun, bonus = 2% gaji pokok
        // jika 2 <= lama bekerja < 5 tahun, bonus = 4% gaji pokok
        // jika lama bekerja >= 5 tahun, bonus = 7% gaji pokok
        } else if (kinerja >= 90) {
            if (lamaBekerja < 2) {
                bonus = 0.02 * gajiPokok;
            } else if (lamaBekerja < 5) {
                bonus = 0.04 * gajiPokok;
            } else {
                bonus = 0.07 * gajiPokok;
            }
        }

        // jika karyawan memiliki sertifikasi profesional, tambahkan bonus sebesar Rp. 500.000
        if (bonus > 0 && sertifikasiInput.equalsIgnoreCase("ya")) {
            bonus += 500000;
        }

        // menampilkan hasil perhitungan bonus
        System.out.println("\n------------------ Rincian Perhitungan Bonus Karyawan ------------------");
        System.out.println("Nilai Kinerja Karyawan\t\t\t\t\t\t: " + kinerja);
        System.out.println("Lama Bekerja\t\t\t\t\t\t\t: " + lamaBekerja + " tahun");
        System.out.println("Gaji Pokok\t\t\t\t\t\t\t: Rp." + (int)gajiPokok);
        System.out.println("Sertifikasi\t\t\t\t\t\t\t: " + sertifikasiInput);
        System.out.println("Total Bonus\t\t\t\t\t\t\t: Rp." + (int)bonus);
    }
}
