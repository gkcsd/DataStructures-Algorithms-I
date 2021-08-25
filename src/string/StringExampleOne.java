package string;

import java.util.Scanner;

public class StringExampleOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Ganesh";

        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,6));
    }
}
