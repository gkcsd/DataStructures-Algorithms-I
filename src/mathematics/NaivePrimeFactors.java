package mathematics;

import java.util.Scanner;

//TC- O(n^2logn) AS- O(1)
public class NaivePrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        primeFact(n);
    }
    static void primeFact(int n) {
        for(int i = 2; i< n; i++) {
            if(isPrime(i)) {
                int x = i;
                while(n%x == 0) {
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
    }
    static boolean isPrime(int n) {
        if(n == 1) return false;

        for(int i = 2; i < n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
