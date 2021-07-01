package bitmagic;

import java.util.Scanner;

//Tc- O(1) & AS- O(1)
public class OptimizedPowerOfTwoSolutionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPowerOfTwoSolTwo(n);
        System.out.println(res);
    }
    static boolean isPowerOfTwoSolTwo(int n) {
        return (n!=0) && ((n&(n-1)) == 0);
    }
}
