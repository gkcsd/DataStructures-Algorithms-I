package string;

import java.util.Scanner;

//TC- O((txt.length-pat.length+1)*pat.length) & AS- O(1)
public class NaivePatternSearching {
    static void getResult(String txt, String pat) {
        for(int i = 0; i <= txt.length()-pat.length(); i++) {
            int j;
            for(j = 0; j < pat.length(); j++) {
                if(pat.charAt(j) != txt.charAt(i+j)) {
                    break;
                }
            }
            if(j == pat.length()) {
                System.out.print(i + " ");
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
