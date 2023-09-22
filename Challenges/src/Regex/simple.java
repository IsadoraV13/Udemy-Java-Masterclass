package Regex;

public class simple {
    public static void main(String[] args) {
//        String sample = "Hello, World!";
//        boolean matches = sample.matches("Hello, World!");
//        System.out.println(matches);

        String sentence1 = "Thee bike is red!";
        boolean isItAMatch1 = sentence1.matches("[A-Z].*\\.");
        boolean isItAMatch2 = sentence1.matches("[A-Z].*!");
        boolean isItAMatch3 = sentence1.matches("[A-Z][a-z]{3}.+!");
        System.out.println(isItAMatch1);
        System.out.println(isItAMatch2);
        System.out.println(isItAMatch3);
    }

}
