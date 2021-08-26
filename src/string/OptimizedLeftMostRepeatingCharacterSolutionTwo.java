package string;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedLeftMostRepeatingCharacterSolutionTwo {
    static final int CHAR = 256;
    static int getLeftMaxChar(String str) {
        boolean[] visited = new boolean[CHAR];

        int res= -1;

        for(int i = str.length() - 1; i >= 0; i--) {
            if(visited[str.charAt(i)]) {
                res = i;
            }else{
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int res = getLeftMaxChar(str);
        System.out.println(res);
    }
}
