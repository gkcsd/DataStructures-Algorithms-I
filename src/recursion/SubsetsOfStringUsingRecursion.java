package recursion;

import java.util.Scanner;

public class SubsetsOfStringUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String curr = "";
        int i = 0;

        getSubsets(s,curr,i);
    }
    static void getSubsets(String s, String curr, int i) {
        if(i == s.length()) {
            System.out.print('"' + curr + '"' + " ");
            return;
        }

        getSubsets(s,curr,i+1);
        getSubsets(s,curr + s.charAt(i),i+1);
    }
}
