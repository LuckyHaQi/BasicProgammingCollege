public class PenjumlahanRekursif16 {
    static int penjumlahan(int f) {
        if (f == 1) {
            return 1;
        } else {
            return f + penjumlahan(f - 1);
        }
    }

    public static void main(String[] args) {
        int f;
        System.out.print("Masukkan nilai f: ");
        f = Integer.parseInt(System.console().readLine());
        System.out.println("1 + ... + " + f + " = " + penjumlahan(f));
    }
}