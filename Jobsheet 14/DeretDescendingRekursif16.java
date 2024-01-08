import java.util.Scanner;
public class DeretDescendingRekursif16 {
    static void cetakDeretRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            cetakDeretRekursif(n - 1);
        }
    }
    static void cetakDeretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai n: ");
        int n = sc.nextInt();
        System.out.print("Deret bilangan dari " + n + " sampai 0: ");
        cetakDeretRekursif(n);
        System.out.print("\nDeret bilangan dari " + n + " sampai 0: ");
        cetakDeretIteratif(n);
    }
}