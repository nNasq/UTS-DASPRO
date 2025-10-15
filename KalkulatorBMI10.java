import java.util.Scanner;

public class KalkulatorBMI10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // meminta input dari user untuk berat dan tinggi badan
        System.out.print("Masukkan berat badan Anda (dalam kg)\t\t: ");
        double berat = sc.nextDouble();
        System.out.print("Masukkan tinggi badan Anda (dalam meter)\t: ");
        double tinggi = sc.nextDouble();

        // menghitung BMI
        double bmi = berat / (tinggi * tinggi);
        // menampilkan hasil BMI dengan 2 angka di belakang koma
        System.out.printf("Indeks Massa Tubuh (BMI) Anda adalah\t\t: %.2f\n", bmi);

        //kategori BMI
        //jika BMI < 18.5 : Kekurangan Berat Badan (Underweight)
        if (bmi < 18.5) {
            System.out.println("Kategori\t\t\t\t\t: Kekurangan Berat Badan (Underweight)");
            System.out.println("Risiko Kesehatan\t\t\t\t: Kekurangan gizi, Osteoporosis, Penurunan sistem kekebalan tubuh");
        //jika 18.5 <= BMI < 24.9 : Berat Badan Normal (Normal Weight)
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Kategori\t\t\t\t\t: Berat Badan Normal (Normal Weight)");
            System.out.println("Risiko Kesehatan\t\t\t\t: Relatif rendah");
        //jika 25 <= BMI < 29.9 : Kelebihan Berat Badan (Overweight)
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Kategori\t\t\t\t: Kelebihan Berat Badan (Overweight)");
            System.out.println("Risiko Kesehatan\t\t\t: Meningkatnya risiko penyakit jantung, diabetes, tekanan darah tinggi");
        //jika BMI >= 30 : Obesitas (Obese)
        } else {
            System.out.println("Kategori\t\t\t\t\t: Obesitas (Obese)");
            System.out.println("Risiko Kesehatan\t\t\t\t: Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker");
        }
    }
}
