package string;

import java.util.Scanner;

//TC- Θ(n) & AS- Θ(n)
public class OptimizedAreStringsRotations {
    static boolean getResult(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        return ((s1+s2).indexOf(s2) >= 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(getResult(s1, s2));
    }
}
