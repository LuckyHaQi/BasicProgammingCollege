import java.util.Scanner;
public class PemilihanPercobaan216{
    public static void main (String[] args){
        Scanner input16 = new Scanner(System.in);

        System.out.print("Masukkan nilai UAS   : ");
        float uas = input16.nextFloat();
        System.out.print("Masukkan nilai UTS   : ");
        float uts = input16.nextFloat();
        System.out.print("Masukkan Nilai Kuis  : ");
        float kuis = input16.nextFloat();
        System.out.print("Masukkan Nilai Tugas : ");
        float tugas = input16.nextFloat();

        float total = (uas * 0.4F ) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Anda dinyatakan remidi" : " Anda tidak dinyatakan remidi";
        System.out.println("Nilai akhir " + total + " sehingga " + message);
    }
}
