package string;

import java.util.Scanner;

//TC- O((N-M+1)*M) & AS- O(1)
public class NaiveAnagramSearch {
    static final int CHAR = 256;
    static boolean isPresent(String txt, String pat) {
        int N = txt.length(), M = pat.length();

        for(int i = 0; i <= N-M; i++) {
            if(areAnagram(txt, pat, i)) {
                return true;
            }
        }

        return false;
    }

    static boolean areAnagram(String txt, String pat, int i) {
        int[] count = new int[CHAR];

        for(int j = 0; j < pat.length(); j++) {
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
        }

        for(int j = 0; j < CHAR; j++) {
            if(count[j] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.next().toLowerCase();
        String pat = sc.next().toLowerCase();

        boolean res = isPresent(txt, pat);
        System.out.println(res);
    }
}
