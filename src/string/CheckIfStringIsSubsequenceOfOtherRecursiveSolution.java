package string;

import java.util.Scanner;

//TC- O(m+n) AS- O(m+n)
public class CheckIfStringIsSubsequenceOfOtherRecursiveSolution {
    static boolean isSub(String s1, String s2, int n, int m) {
        if(m == 0) return true;
        if(n == 0) return false;

        if(s1.charAt(n-1) == s2.charAt(m-1)) {
            return isSub(s1, s2, n-1, m-1);
        }else{
            return isSub(s1, s2, n-1, m);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int n = s1.length();
        int m = s2.length();

        boolean res = isSub(s1, s2, n, m);
    }
}
