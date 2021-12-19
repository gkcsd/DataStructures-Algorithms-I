package practiceproblems;

import java.util.*;
import java.lang.*;

public class ConsonantsSolution {
    static int getCon(String s) {
        int count = 1;
        int vowels = 0;
        boolean flag = true;
        char last_Value = s.charAt(0);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o' || s.charAt(i) != 'u') {
               for(int j = i; j < s.length(); j++) {
                   if(s.charAt(i) == s.charAt(j)) {
                       count++;
                       flag = false;
                   }
                   if(flag == false) {
                       System.out.print(s.charAt(i) + "=" + count + ", ");
                       count = 1;
                       break;
                   }
               }
            }else{
                vowels++;
            }
        }
        return vowels;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int res = getCon(s);
        System.out.println(res);
    }
}
