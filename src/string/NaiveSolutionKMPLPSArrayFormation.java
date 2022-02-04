package string;

import java.util.Scanner;

//TC- O(n*n*n) & AS- O(n)
public class NaiveSolutionKMPLPSArrayFormation {
    static int longPropPreSuffix(String txt, int n) {
        for(int len = n-1; len > 0; len--) {
            boolean flag = true;
            for(int i = 0; i < len; i++) {
                if(txt.charAt(i) != txt.charAt(n-len+i)) {
                    flag = false;
                }
            }
            if(flag) {
                return len;
            }
        }
        return 0;
    }

    static void fillLPS(String txt, int[] lps) {
        for(int i = 0; i < txt.length(); i++) {
            lps[i] = longPropPreSuffix(txt, i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.next();
        int[] lps = new int[txt.length()];

        fillLPS(txt, lps);
        for(int x: lps) {
            System.out.print(x + " ");
        }
    }
}
