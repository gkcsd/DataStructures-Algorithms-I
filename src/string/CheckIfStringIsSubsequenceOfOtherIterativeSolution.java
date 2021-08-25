package string;

import java.util.Scanner;

//TC- O(n+m) & As- O(1)
public class CheckIfStringIsSubsequenceOfOtherIterativeSolution {
    static boolean isSubseq(String s1, String s2, int n, int m) {

        if(n < m) return false;

        int j = 0;
        for(int i = 0; i < n && j < m; i++) {
            if(s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        return (j == m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n = s1.length();
        int m = s2.length();

        boolean res = isSubseq(s1, s2, n, m);
        if(res)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
