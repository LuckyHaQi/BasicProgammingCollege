import java.util.Scanner;
public class ArrayRataNilai16{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int [jmlMhs];
        int mhsLulus = 0;
        double total = 0;
        double rata2;
        for (int i = 0; i < jmlMhs; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70){
                mhsLulus += 1;
            }
        }
        for (int i = 0; i < jmlMhs; i++){
            total += nilaiMhs[i];
        }
        rata2 = total / jmlMhs;
        System.out.println("Rata-rata nilai: " + rata2);
        System.out.println("Mahasiswa yang lulus: " + mhsLulus + " orang");
    }
}