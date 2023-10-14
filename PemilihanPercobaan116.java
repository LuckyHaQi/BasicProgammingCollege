import java.util.Scanner;
public class PemilihanPercobaan116{
    public static void main (String[] args){
        Scanner input16 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input16.nextInt();

        //if (angka % 2 == 0)
        //System.out.println ("angka " + angka + " bilangan genap");
        //else
        //System.out.println ("angka " + angka + " bilangan ganjil");

        String hasil;
        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);
    }
}