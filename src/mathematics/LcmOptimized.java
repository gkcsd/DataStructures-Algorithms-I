package mathematics;

import java.util.Scanner;

//TC- O(log(min(a,b)) AS- O(1)
public class LcmOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        gcdFun(a,b);

        int res = lcmFun(a,b);
        System.out.println(res);
    }
    static int gcdFun(int a, int b) {
        if( b == 0 ) {
            return a;
        }
        return gcdFun(b,a%b);
    }
    static int lcmFun(int a, int b) {
        return (a*b)/gcdFun(a,b);
    }

}
