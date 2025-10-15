import java.util.Scanner;

public class MenghitungBilanganTerbesar10 {
    public static void main(String[] args) {
        // membuat objek scanner
        Scanner sc = new Scanner(System.in);

        // meminta input dari user untuk 3 angka
        System.out.print("Masukkan angka pertama\t\t\t\t: ");
        int pertama = sc.nextInt();
        System.out.print("Masukkan angka kedua\t\t\t\t: ");
        int kedua = sc.nextInt();
        System.out.print("Masukkan angka ketiga\t\t\t\t: ");
        int ketiga = sc.nextInt();

        // membuat tipe data int dan membuat variabel terbesar dengan nilai awal angka
        int terbesar = pertama;

        // membandingkan bilangan pertama dengan kedua dan ketiga
        if (kedua > terbesar) {
            terbesar = kedua;
        }
        if (ketiga > terbesar) {
            terbesar = ketiga;
        }

        // mengecek apakah ada nilai yang sama
        int nilaiSama = 0;

        // menampung angka yang memiliki nilai terbesar
        String angkaTerbesar = "";

        // mengecek angka mana saja yang memiliki nilai terbesar
        if (terbesar == pertama) {
            nilaiSama++;
            angkaTerbesar += pertama + "  ";
        }
        // mengecek angka mana saja yang memiliki nilai terbesar
        if (terbesar == kedua) {
            nilaiSama++;
            angkaTerbesar += kedua + " ";
        }
        // mengecek angka mana saja yang memiliki nilai terbesar
        if (terbesar == ketiga) {
            nilaiSama++;
            angkaTerbesar += ketiga + " ";
        }

        // mengecek apakah ada nilai yang sama
        if (nilaiSama > 1) {
            //jika ada nilai yang sama, menampilkan hasil bilangan terbesar dan angka yang memiliki nilai terbesar
            System.out.println("Ada angka terbesar yang sama dengan nilai\t: " + terbesar);
            System.out.println("Angka tersebut adalah\t\t\t\t: " + angkaTerbesar);
        } else {
            //jika tidak ada nilai yang sama,
            // menampilkan hasil bilangan terbesar
            System.out.println("Bilangan terbesar adalah\t\t\t\t: " + terbesar);
        }
    }
}
