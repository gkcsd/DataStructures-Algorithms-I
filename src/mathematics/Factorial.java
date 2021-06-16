package mathematics;

import java.util.Scanner;

//TC- 0(n) and AS- 0(1)
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = factSol(n);
        System.out.println(r);
    }
    static int factSol(int n) {
        int fact = 1;
        for(int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
