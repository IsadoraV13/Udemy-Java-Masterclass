package Section5;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int kiloBytesToMegaBytesConversion = 1024;
        int remainingKilobytes = kiloBytes % kiloBytesToMegaBytesConversion;
        int MegaBytes = kiloBytes / kiloBytesToMegaBytesConversion;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else
            System.out.println(kiloBytes + " KB = " + MegaBytes + " MB and " + remainingKilobytes + " KB");
    }
}