import java.util.Scanner;
public class NestedLoop_2341720077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        // Input temperatures
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        // Output temperatures using foreach loops
        for (double[] cityTemperatures : temps) {
            // Calculate the average temperature for the city
            double average = 0;
            for (double temperature : cityTemperatures) {
                average += temperature;
            }
            average /= cityTemperatures.length;

            int i = 0;
            // Print the city and average temperature
            System.out.print("Kota: " + (i + 1) + " | Rata-rata: " + average + "\n");
        }
    }
}
