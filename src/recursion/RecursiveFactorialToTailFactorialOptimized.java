package recursion;

import java.util.Scanner;

public class RecursiveFactorialToTailFactorialOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;

        int res = factProgToTail(n,k);
        System.out.println(res);
    }
    static int factProgToTail(int n, int k) {
        if(n == 0 || n == 1)
            return k;

        return factProgToTail(n-1, k*n);
    }
}
