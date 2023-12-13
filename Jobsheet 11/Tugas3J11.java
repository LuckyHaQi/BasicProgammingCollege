import java.util.Scanner;

public class Tugas3J11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();
        
        if (N < 3) {
            System.out.println("Nilai N minimal harus 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Mencetak angka dan underscore
                for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print(N);
                    } else {
                        System.out.print(" ");
                    }
                    if (j < N) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}