package string;

import java.util.Scanner;

//TC- O(n+CHAR) & AS- O(CHAR)
public class OptimizedCheckIsAnagram {
    static final int CHAR = 256;
    static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        int[] count = new int[CHAR];

        for(int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i = 0; i < CHAR; i++) {
            if(count[i] != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        boolean res= isAnagram(s1,s2);
        System.out.println(res);
    }
}
