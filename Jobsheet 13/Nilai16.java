import java.util.Scanner;

public class Nilai16 {

    static int[][] nilaiTugas;
    static int[] mahasiswa;

    public static void main(String[] args) {
        // Input jumlah mahasiswa dan tugas
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = input.nextInt();

        // Inisialisasi array nilaiTugas dan mahasiswa
        nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];
        mahasiswa = new int[jumlahMahasiswa];

        // Input data nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            mahasiswa[i] = i + 1;
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Masukkan nilai tugas untuk mahasiswa ke-" + (i + 1) + ", minggu ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = input.nextInt();
            }
        }

        // Tampilkan seluruh nilai mahasiswa
        tampilNilai();

        // Cari nilai tertinggi
        int nilaiTertinggi = cariNilaiTertinggi();

        // Tampilkan mahasiswa dengan nilai tertinggi
        tampilMahasiswaNilaiTertinggi(nilaiTertinggi);
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    static void tampilNilai() {
        System.out.println("| Mahasiswa | Tugas 1 | Tugas 2 | Tugas 3 | Tugas 4 | Tugas 5 | Tugas 6 | Tugas 7 |");
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.print("|     " + mahasiswa[i] + "     |   ");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print(nilaiTugas[i][j] + "    |   ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari nilai tertinggi
    static int cariNilaiTertinggi() {
        int nilaiTertinggi = nilaiTugas[0][0];
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiTugas[i][j];
                }
            }
        }
        return nilaiTertinggi;
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi
    static void tampilMahasiswaNilaiTertinggi(int nilaiTertinggi) {
        System.out.println("\nMahasiswa yang mempunyai Nilai tertinggi pada tugas ke-");
        System.out.println("| Mahasiswa | Tugas |");
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTugas[i][j] == nilaiTertinggi) {
                    System.out.print("|     " + mahasiswa[i] + "     |   " + (j + 1) + "   |");
                    break;
                }
            }
        }
    }
}