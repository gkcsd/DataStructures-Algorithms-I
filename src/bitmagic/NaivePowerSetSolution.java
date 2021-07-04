package bitmagic;

import java.util.Scanner;

//TC- 0(2^n*n) & AS- 0(1)
public class NaivePowerSetSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        powerSetFun(s);
    }
    static void powerSetFun(String s) {
        int n = s.length();
        int powerSize = (int)Math.pow(2,n);

        for(int counter=0; counter<powerSize; counter++) {
            for(int j=0; j<n; j++) {
                if((counter & (1<<j)) != 0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
