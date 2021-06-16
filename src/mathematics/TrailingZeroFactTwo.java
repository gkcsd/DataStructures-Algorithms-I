package mathematics;

import java.util.Scanner;

//TC- 0(logn) & AS- 0(1)
//it prevents integer overflow issue
public class TrailingZeroFactTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = railZeroFact(n);
        System.out.println(res);
    }
    static int railZeroFact(int n) {
        int val = 0;
        for (int i = 5; i <= n; i = i * 5) {
            val = val + n / i;
        }
        return val;
    }
}
