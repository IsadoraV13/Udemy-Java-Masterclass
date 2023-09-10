package Section5;

public class SpeedConverter {

    public static void main(String[] args) {

        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometersPerHour) {

        long milesPerHour = -1;
        double kilometerToMileConversion = 1.609;
        if (kilometersPerHour < 0) {
            return milesPerHour;
        } else if (kilometersPerHour >= 0) {
            milesPerHour = Math.round(kilometersPerHour / kilometerToMileConversion);
        }
        return milesPerHour;
    }

    public static void printConversion (double kilometersPerHour) {
        long milesPerHour = -1;
        double kilometerToMileConversion = 1.609;
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");;
        } else if (kilometersPerHour >= 0) {
            milesPerHour = Math.round(kilometersPerHour / kilometerToMileConversion);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
}
