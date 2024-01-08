public class Fibbonaci16 {

    public static void main(String[] args) {
        for (int bulan = 1; bulan <= 12; bulan++) {
            int[] hasil = hitungPasanganMarmut(bulan);
            
            System.out.println("Hasil reproduksi pada bulan ke-" + bulan + ":");
            System.out.println("Produktif: " + hasil[0]);
            System.out.println("Tidak Produktif: " + hasil[1]);
            System.out.println("Total Pasangan: " + hasil[2]);
            System.out.println("-------------");
        }
    }

    public static int[] hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return new int[]{1, 0, 1};
        } else {
            int[] bulanSebelumnya = hitungPasanganMarmut(bulan - 1);
            int produktif = bulanSebelumnya[1];
            int tidakProduktif = bulanSebelumnya[0] + bulanSebelumnya[1];
            int totalPasangan = bulanSebelumnya[2] + tidakProduktif;

            return new int[]{produktif, tidakProduktif, totalPasangan};
        }
    }
}