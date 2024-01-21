public class Main {
// Fady Zaki SDEV 200 1/20/24
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Feet", "Meters", "|", "Meters      Feet");
        System.out.println("------------------------------------------------------------------");

        for (double feet = 1.0; feet <= 10.0; feet++) {
            double meters = footToMeter(feet);
            double metersRight = 20 + 5 * (feet - 1);
            double feetRight = meterToFoot(metersRight);
          System.out.printf("%-15.1f%-15.3f%-15s%-15s\n", feet, meters, "|", metersRight + "      " + feetRight)
        }
    }
}
