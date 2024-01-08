import java.util.Scanner;

public class Percobaan2{

    static int hitungPangkat(int x, int y){
        if (y == 0){
            return(1);
        }else{
            return (x * hitungPangkat(x, y-1));
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        int hasil = 1;
        for (int i = pangkat; i >= 1; i--){
            hasil *= bilangan;
            System.out.print(bilangan + "x");
        }
        System.out.print(bilangan + "x1 = " + hasil);
    }
}