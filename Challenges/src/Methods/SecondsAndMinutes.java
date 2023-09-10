package Methods;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        getDuratingString(8274);

    }

    public static void getDuratingString(int seconds) {
        int hours = seconds / 3600;
        double remaining_minutes = ((double) seconds % 3600) / 3600;
        int minutes = (int) Math.floor(remaining_minutes * 60);
        System.out.println(minutes);
        int remaining_seconds = 1;
        System.out.println( hours + "h" + minutes + "m" + remaining_seconds + "s");

    }

    public static void getDuratingString(int minutes, int seconds) {

    }
}
