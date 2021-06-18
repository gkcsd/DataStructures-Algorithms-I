package mathematics;

import java.util.Scanner;

//TC- O(√ n) & AS- O(1)
public class OptimizedPrimeSolutionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean res = isPrime(n);
        System.out.println(res);
    }
    static boolean isPrime(int n) {
        if(n == 1) return false;

        for(int i = 2; i*i <= n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
