package string;

import java.util.Scanner;

//TC- 0(n) & As- 0(n)
public class NaiveCheckIsPalindrome {
    static boolean checkIsPalindrome(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();

        return str.equals(rev.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean res = checkIsPalindrome(str);
        System.out.println(res);
    }
}
