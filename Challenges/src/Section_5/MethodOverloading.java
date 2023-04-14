package Section_5;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("12 inches = " + convertToCentimetres(12) + "cm");
        System.out.println("5 feet and 7 inches = " + convertToCentimetres(5, 7) + "cm");
    }

    public static double convertToCentimetres(int height_inches) {
        double height_centimetres = height_inches * 2.54;
        return height_centimetres;
    }

    public static double convertToCentimetres(int height_feet, int height_remaining_inches) {
        int height_total_inches = (height_feet * 12) + height_remaining_inches;
        double height_centimetres;
        height_centimetres = convertToCentimetres(height_total_inches);
        return height_centimetres;
    }
}
