package recursion;

import java.util.Scanner;

//TC- 0(d) & AS- 0(d)
public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = sumOfDig(n);

        System.out.println(res);
    }
    static int sumOfDig(int n) {
        if(n == 0)
            return n;

        return n%10 + sumOfDig(n/10);
    }
}
