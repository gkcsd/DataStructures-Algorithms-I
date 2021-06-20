package mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class OptimizedSieveOfEratosthenesSolutionTwo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        printPrime(n);
    }
    static void printPrime(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i*i<=n; i++) {
            if(isPrime[i]) {
                for(int j = i*i; j<=n; j=j+i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i<=n; i++) {
            if(isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
