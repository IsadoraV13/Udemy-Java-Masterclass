package Methods;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println("1 " + shouldWakeUp(true, 1));
        System.out.println("2 " +shouldWakeUp(false, 2));
        System.out.println("3 " +shouldWakeUp(true, 8));
        System.out.println("4 " +shouldWakeUp(true, -1));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            //barking at night
            return true;
        } else
            // barking during the day
            return false;
    }
}
