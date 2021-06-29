package mathematics;

import java.util.Scanner;

//Tc- O(1) & AS- O(1)
public class OptimizedPowerOfTwoSolutionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=isPowerTwoSolOne(n);
        System.out.println(res);
    }
    static boolean isPowerTwoSolOne(int n) {
        if(n==0)
            return false;
        return ((n&(n-1))==0);
    }
}
