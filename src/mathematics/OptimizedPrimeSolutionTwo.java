package mathematics;

import java.util.Scanner;

//It is more optimized as compared to first solution because it did 1/3 work of square root of nth time
public class OptimizedPrimeSolutionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean res = isPrime(n);
        System.out.println(res);
    }
    static boolean isPrime(int n) {
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;

        if(n%2 == 0 || n%3 == 0) return false;

        for(int i = 5; i*i <= n; i=i+6) {
            if(n%i == 0 || n%(i+2) == 0) {
                return false;
            }
        }
        return true;
    }
}
