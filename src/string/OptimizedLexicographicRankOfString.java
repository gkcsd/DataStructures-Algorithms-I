package string;

import java.util.Scanner;

//TC- O(n) * AS- O(1)
public class OptimizedLexicographicRankOfString {
    static final int CHAR = 256;
    static int lexRank(String str) {
        int res = 1;
        int n = str.length();
        int mul = fact(n);

        int[] count = new int[CHAR];

        for(int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

        for(int i = 1; i < CHAR; i++) {
            count[i] += count[i-1];
        }

        for(int i = 0; i < n-1; i++) {
            mul = mul/(n-i);
            res = res + count[str.charAt(i) - 1] * mul;
            for(int j = str.charAt(i); j < CHAR; j++) {
                count[j]--;
            }
        }
        return res;
    }

    static int fact(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int res = lexRank(str);
        System.out.println(res);
    }
}
