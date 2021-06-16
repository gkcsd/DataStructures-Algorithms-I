package mathematics;

import java.util.Scanner;

public class CountNumberRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(countDigit(n));
    }
    static int countDigit(long n) {
        if(n == 0)
            return 0;
        return 1 + countDigit(n/10);
    }
}
