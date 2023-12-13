import java.util.Scanner;
public class TugasJ9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input banyaknya elemen
        System.out.print("Masukkan banyaknya elemen: ");
        int banyakElemen = input.nextInt();

        // Deklarasi array
        int[] array = new int[banyakElemen];

        // Input nilai tiap elemen
        for (int i = 0; i < banyakElemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Hitung nilai tertinggi
        int nilaiTertinggi = array[0];
        for (int i = 1; i < banyakElemen; i++) {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }
        }

        // Hitung nilai terendah
        int nilaiTerendah = array[0];
        for (int i = 1; i < banyakElemen; i++) {
            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }
        }

        // Hitung nilai rata-rata
        int total = 0;
        for (int i = 0; i < banyakElemen; i++) {
            total += array[i];
        }
        float nilaiRataRata = (float) total / banyakElemen;

        // Output
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + nilaiRataRata);
    }
}