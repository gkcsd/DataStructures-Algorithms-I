package string;

import java.util.Arrays;
import java.util.Scanner;

//TC- O(nlogn) & As- O(n)
public class NaiveCheckIsAnagram {
    static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        s1 = new String(c1);

        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        s2 = new String(c2);

        return s1.equals(s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        boolean res = isAnagram(s1,s2);
        System.out.println(res);
    }
}
