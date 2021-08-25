package string;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedPalindrome {
    static boolean checkIsPal(String str) {
        int begin = 0;
        int end = str.length()-1;

        while(begin < end) {
            if(str.charAt(begin) != (str.charAt(end))) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        boolean res = checkIsPal(str);
        System.out.println(res);
    }
}
