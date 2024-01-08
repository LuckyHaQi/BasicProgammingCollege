import java.util.Scanner;
public class Nilai16 {
    static int[][] nilaiTugas = new int[5][7];
    static String[] nama = {"Sari", "Rina", "Yani", "Dwi ", "Lusi"};
    public static void main(String[] args) {
        // Input data nilai mahasiswa
        inputDataNilai();

        // Tampilkan seluruh nilai mahasiswa
        tampilNilai();

        // Cari nilai tertinggi
        int nilaiTertinggi = cariNilaiTertinggi();

        // Tampilkan mahasiswa dengan nilai tertinggi
        tampilMahasiswaNilaiTertinggi(nilaiTertinggi);
    }

    // Fungsi untuk input data nilai mahasiswa
    static void inputDataNilai() {
        Scanner input = new Scanner(System.in);

        // Input data nilai Sari
        System.out.println("Nilai tugas Sari");
        for (int i = 0; i < 7; i++) {
            System.out.print("Minggu ke-" + (i + 1) + ": ");
            nilaiTugas[0][i] = input.nextInt();
        }

        // Input data nilai Rina
        System.out.println("Nilai tugas Rina");
        for (int i = 0; i < 7; i++) {
            System.out.print("Minggu ke-" + (i + 1) + ": ");
            nilaiTugas[1][i] = input.nextInt();
        }

        // Input data nilai Yani
        System.out.println("Nilai tugas Yani");
        for (int i = 0; i < 7; i++) {
            System.out.print("Minggu ke-" + (i + 1) + ": ");
            nilaiTugas[2][i] = input.nextInt();
        }

        // Input data nilai Dwi
        System.out.println("Nilai tugas Dwi");
        for (int i = 0; i < 7; i++) {
            System.out.print("Minggu ke-" + (i + 1) + ": ");
            nilaiTugas[3][i] = input.nextInt();
        }

        // Input data nilai Lusi
        System.out.println("Nilai tugas Lusi");
        for (int i = 0; i < 7; i++) {
            System.out.print("Minggu ke-" + (i + 1) + ": ");
            nilaiTugas[4][i] = input.nextInt();
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    static void tampilNilai() {
        System.out.println("| Nama | Minggu 1 | Minggu 2 | Minggu 3 | Minggu 4 | Minggu 5 | Minggu 6 | Minggu 7 |");
        for (int i = 0; i < 5; i++) {
            System.out.print("| " + nama[i] + " |    ");
            for (int j = 0; j < 7; j++) {
                System.out.print(nilaiTugas[i][j] + "    |    ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari nilai tertinggi
    static int cariNilaiTertinggi() {
        int nilaiTertinggi = nilaiTugas[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilaiTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiTugas[i][j];
                }
            }
        }
        return nilaiTertinggi;
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi
    static void tampilMahasiswaNilaiTertinggi(int nilaiTertinggi) {
        
        System.out.println("| Nama | Minggu |");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (nilaiTugas[i][j] == nilaiTertinggi) {
                    System.out.print("| " + nama[i] + " |    " + (j + 1) + "   |");
                    break;
                }
            }
        }
    }
}