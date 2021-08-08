package recursion;

import java.util.Scanner;

public class SumOfNaturalNumberUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = sumOfNatRec(n);
        System.out.println(res);
    }
    static int sumOfNatRec(int n) {
        if(n == 0)
            return 0;
        return n + sumOfNatRec(n-1);
    }
}
