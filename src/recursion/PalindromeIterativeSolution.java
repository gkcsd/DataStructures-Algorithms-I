package recursion;

import java.util.Scanner;

//TC- 0(d) & AS- 0(1)
public class PalindromeIterativeSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = getSumOfDig(n);
        System.out.println(res);
    }
    static int getSumOfDig(int n) {
        int res = 0;
        while(n != 0) {
            res = res + n%10;
            n=n/10;
        }
        return res;
    }
}
