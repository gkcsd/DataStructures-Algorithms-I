package mathematics;

import java.util.Scanner;

public class PalindromeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean res = isPal(n);
        System.out.println(res);
    }
    static boolean isPal(int n) {
        int rev = 0;
        int temp = n;
        while(temp != 0) {
            int x = temp%10;
            rev = rev*10 + x;
            temp/=10;
        }
        return (n==rev);
    }
}
