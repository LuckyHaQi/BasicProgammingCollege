import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;     
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer < number) {
                    System.out.println("Terlalu kecil. Coba lagi.");
                } else if (answer > number) {
                    System.out.println("Terlalu besar. Coba lagi.");
                } else {
                    success = true;
                }
            } while (!success);
            System.out.println("Selamat! Anda benar.");
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y) atau keluar (X/x)? ");
            menu = input.nextLine().charAt(0);
            if (menu == 'x' || menu == 'X') {
                System.out.println("Terima kasih sudah bermain. Sampai jumpa!");
                break; // Keluar dari loop do-while
            }
        } while (menu == 'y' || menu == 'Y');
    }
}
