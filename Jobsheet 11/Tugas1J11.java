import java.util.Scanner;

public class Tugas1J11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        if (N < 3) {
            System.out.println("Nilai N minimal harus 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Mencetak spasi
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }
                // Mencetak angka
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}