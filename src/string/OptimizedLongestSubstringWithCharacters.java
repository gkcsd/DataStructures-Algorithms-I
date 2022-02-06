package string;

import java.util.Arrays;
import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedLongestSubstringWithCharacters {
    static int getLargestSubstring(String str) {
        int n = str.length(), res = 0;

        int[] prev = new int[256];
        Arrays.fill(prev, -1);
        int i = 0;
        for(int j = 0; j < n; j++) {
            i = Math.max(i, prev[str.charAt(j)] + 1);
            int maxEnd = j-i+1;

            res = Math.max(res, maxEnd);

            prev[str.charAt(j)] = j;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(getLargestSubstring(str));
    }
}
