package string;

import java.util.Arrays;
import java.util.Scanner;

//TC- 0(n+CHAR) & AS- O(CHAR)
public class OptimizedNonRepeatingLeftMostCharacter {
    static final int CHAR = 256;
    static int getMaxLeftNonRepeatingChar(String str) {
        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex, -1);

        for(int i = 0; i < str.length(); i++) {
            if(fIndex[str.charAt(i)] == -1) {
                fIndex[str.charAt(i)] = i;
            }else{
                fIndex[str.charAt(i)] = -2;
            }
        }

        int res = Integer.MAX_VALUE;
        for(int i = 0; i < CHAR; i++) {
            if(fIndex[i] > 0)
                res = Math.min(res, fIndex[i]);
        }

        return ((res == Integer.MAX_VALUE) ? -1 : res);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();

        int res = getMaxLeftNonRepeatingChar(str);
        System.out.println(res);
    }
}
