public class CekPrimaRekursif16 {
    static int cekPrima(int n) {
        if (n <= 1) {
            return 0;
        } else if (n % 2 == 0) {
            return 0;
        } else {
            return cekPrima(n - 1);
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Masukkan nilai n: ");
        n = Integer.parseInt(System.console().readLine());
        if (cekPrima(n) == 1) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}