package mathematics;

import java.util.Scanner;

//TC- O(n) & As- O(1)
public class NaivePowerOfTwoSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean res = powerOfTwo(n);
        System.out.println(res);
    }
    static boolean powerOfTwo(int n) {
       if(n==0) return false;
       while(n != 1) {
           if(n%2 != 0) {
               return false;
           }
           n=n/2;
       }
       return true;
    }
}
