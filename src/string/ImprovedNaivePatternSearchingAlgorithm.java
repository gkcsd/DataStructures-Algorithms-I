package string;

import java.util.Scanner;

//TC- Θ(n) & AS- O(1)
public class ImprovedNaivePatternSearchingAlgorithm {
    static void getResult(String txt, String pat) {
        int n = txt.length(), m = pat.length();
        for(int i = 0; i <= n-m; ) {
            int j;
            for(j = 0; j < m; j++) {
                if(pat.charAt(j) != txt.charAt(i+j)) {
                    break;
                }
            }
            if(j == m) {
                System.out.print(i + " ");
            }

            if(j == 0) {
                i++;
            }else {
                i = i+j;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.next();
        String pat = sc.next();

        getResult(txt, pat);
    }
}
