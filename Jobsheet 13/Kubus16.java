import java.util.Scanner;
public class Kubus16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sisiKubus, L, vol;
        System. out.print("Masukkan Sisi: ");
        sisiKubus=input.nextInt();


        L=hitungLuas(sisiKubus);
        System. out.println ("Luas Kubus adalah "+L);
        vol=hitungVolume(sisiKubus);
        System. out.println ("Volume Kubus adalah "+vol);

    }
    //Fungsi Hitung Luas
    static int hitungLuas (int sisiKubus){
    int Luas=sisiKubus * sisiKubus * 6;
    return Luas;
    }

    //Fungsi Hitung Volume
    static int hitungVolume (int sisiKubus){
    int volume= sisiKubus * sisiKubus * sisiKubus ;
    return volume;
    } 
}