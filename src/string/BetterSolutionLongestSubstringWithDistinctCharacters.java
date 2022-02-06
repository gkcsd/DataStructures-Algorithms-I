package string;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class BetterSolutionLongestSubstringWithDistinctCharacters {
    static int getLargest(String str) {
        int n = str.length(), res = 0;

        for(int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            for(int j = i; j < n; j++) {
                if(visited[str.charAt(j)]) {
                    break;
                }else {
                    res = Math.max(res, j-i+1);
                    visited[str.charAt(j)] = true;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(getLargest(str));
    }
}
