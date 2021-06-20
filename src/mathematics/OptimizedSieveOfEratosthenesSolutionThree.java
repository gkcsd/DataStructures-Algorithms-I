package mathematics;

import java.util.Arrays;
import java.util.Scanner;

//TC- O(nloglog(n)) & AS- O(1)
public class OptimizedSieveOfEratosthenesSolutionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sieveFun(n);
    }
    static void sieveFun(int n) {
        if(n == 1) return;

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i<=n; i++) {
            if(isPrime[i]) {
                System.out.print(i + " ");
                for(int j=i*i; j<=n; j=j+i) {
                    isPrime[j]=false;
                }
            }
        }
    }
}
