import java.util.Scanner;

public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = scan.nextInt();
            scan.nextLine(); 

            switch (menu) {
                case 1:
                    do {
                        System.out.print("Masukkan nama: ");
                        nama = scan.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = scan.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = scan.nextInt();
                        scan.nextLine(); 

                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length && penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil diinput.");
                        } else {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                        }
                    } while (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length || penonton[baris - 1][kolom - 1] != null);
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);

                default:
                    System.out.println("Pilihan menu tidak valid.");
                    break;
            }

            System.out.print("Lanjut ke menu lain? (y/n): ");
            next = scan.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}