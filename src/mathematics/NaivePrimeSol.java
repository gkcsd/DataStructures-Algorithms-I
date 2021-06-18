package mathematics;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class NaivePrimeSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean res = checkPrime(n);
        System.out.println(res);
    }
    static boolean checkPrime(int n) {
        if(n == 1) return false;

        for(int i = 2; i < n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
