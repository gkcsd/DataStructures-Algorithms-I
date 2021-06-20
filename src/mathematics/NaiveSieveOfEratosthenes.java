package mathematics;

import java.util.Scanner;

//TC- O(n*sqrt(n)) & AS- O(1)
public class NaiveSieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        printPrime(n);
    }
    static void printPrime(int n) {
        for(int i = 2; i<=n; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
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
