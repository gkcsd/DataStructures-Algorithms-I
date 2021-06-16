package mathematics;

import java.util.Scanner;

//It's Naive solution
//TC- 0(n) & AC-0(1)
public class TrailingZeroFactOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = trailZeroFact(n);
        System.out.println(res);
    }
    static int trailZeroFact(int n) {
        int count = 0;
        int fact = 1;
        for(int i = 2; i <= n; i++) {
            fact*=i;
        }
        while(fact%10 == 0) {
            count++;
            fact/=10;
        }
        return count;
    }
}
