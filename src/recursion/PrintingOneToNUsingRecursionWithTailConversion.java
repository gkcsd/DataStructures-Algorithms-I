package recursion;

import java.util.Scanner;

public class PrintingOneToNUsingRecursionWithTailConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k = 1;
        printTailConFun(n,k);
    }
    static void printTailConFun(int n, int k) {
        if(n == 0)
            return;

        System.out.print(k + " ");
        printTailConFun(n-1, k+1);
    }
}
