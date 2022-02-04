package string;

import java.util.Scanner;

//TC- O(2N) & AS- O(M)
public class FullOptimizedKMPAlgorithm {
    static void getKMP(String txt, String pat) {
        int N = txt.length();
        int M = pat.length();

        int[] lps = new int[M];

        fillLPSArray(pat, lps);

        int i = 0, j = 0;
        while(i < N) {
            if(pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if(j == M) {
                System.out.print(i-j);
                j = lps[j-1];
            }

            while (i < N && pat.charAt(j) != txt.charAt(i)) {
                if(j == 0) {
                    i++;
                }else {
                    j = lps[j-1];
                }
            }
        }
    }

    static void fillLPSArray(String pat, int[] lps) {
        int patLength = pat.length(), len = 0;
        lps[0] = 0;
        int i = 1;

        while( i < patLength) {
            if(pat.charAt(i) == pat.charAt(len)) {
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
        String pat = sc.next();

        getKMP(txt, pat);
    }
}
