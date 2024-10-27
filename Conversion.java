public class Conversion {

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s | %-10s%-10s%n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("----------------------------------------------");

        // Display the table for feet to meters and meters to feet
        for (double foot = 1.0, meter = 20.0; foot <= 10.0; foot++, meter += 5.0) {
            double metersFromFeet = footToMeter(foot);
            double feetFromMeters = meterToFoot(meter);
            System.out.printf("%-10.1f%-10.3f | %-10.1f%-10.3f%n", foot, metersFromFeet, meter, feetFromMeters);
        }
    }
}
