package recursion;

import java.util.Scanner;

public class PrintingNToOneUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        printNum(n);
    }
    static void printNum(int n) {
        if(n == 0)
            return;

        System.out.print(n + " ");

        printNum(n-1);
    }
}
