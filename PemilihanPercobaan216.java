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
        //System.out.println("Nilai akhir " + total + " sehingga " + message);

        String predikat;
        if (100 >= total && total > 80){
                predikat = " A " ;
        }   else if (80 >= total && total > 73) {
                predikat = " B+ ";
        }   else if (73 >= total && total > 65) {
                predikat = " B " ;
        }   else if (65 >= total && total > 60) {
                predikat = " C+ ";
        }   else if (60 >= total && total > 50) {
                predikat = " C " ;
        }   else if (50 >= total && total > 39) {
                predikat = " D " ;
        }   else {
                predikat = " E " ;
        }
        System.out.println("Nilai total yang didapat " + total + " sehingga mendapat predikat" + predikat);
    }
}
