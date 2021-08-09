package recursion;

import java.util.Scanner;

//TC- O(n) & AS- O(n)
public class PalindromeCheckUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = 0, end = str.length()-1;
        boolean val = isPal(str, start,end);
        System.out.println(val);
    }
    static boolean isPal(String str, int start, int end) {
        if(start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end)) && isPal(str, start+1, end-1);
    }
}
