package mathematics;

import java.util.Scanner;

//TC- O(a*b-max(a,b)) & AS- O(1)
public class LcmOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = lcmNaive(a,b);
        System.out.println(res);
    }
    static int lcmNaive(int a, int b) {
        int res = Math.max(a,b);
        while(a!=b) {
            if(res%a == 0 && res%b == 0) {
                return res;
            }
            res++;
        }
        return res;
    }
}
