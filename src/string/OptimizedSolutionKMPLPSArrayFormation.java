package string;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedSolutionKMPLPSArrayFormation {
    static void fillLPS(String txt, int[] lps) {
        int n = txt.length(), len = 0;
        lps[0] = 0;
        int i = 1;
        while(i < n) {
            if(txt.charAt(i) == txt.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }else {
                if(len == 0) {
                    lps[i] = 0;
                    i++;
                }else {
                    len = lps[len-1];
                }
            }
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
