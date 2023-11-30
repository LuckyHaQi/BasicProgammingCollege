import java.util.Scanner;
public class Pemilihan2Percobaan216{
    public static void main (String[] args){
        Scanner input16 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalsudut;
        System.out.println("Masukkan Sudut 1: ");
        sudut1 = input16.nextFloat();
        System.out.println("Masukkan Sudut 2: ");
        sudut2 = input16.nextFloat();
        System.out.println("Masukkan Sudut 3: ");
        sudut3 = input16.nextFloat();

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180){
            if ((sudut1 == 90) && (sudut2 == 45) && (sudut3 == 45)){
                System.out.println("Segitiga tersebut adalah segitiga siku siku dan sama kaki");
            }else if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku siku");
            }else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)){
                System.out.println("Segitiga tersebut adalah sama kaki ");
            }else{
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        }else{
            System.out.println("Bukan segitiga");
        }
    }
}