package mathematics;

import java.util.Scanner;

//TC- O(min(a.b)) & AS- 0(1)
public class GcdNaiveSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = gcdFun(a,b);
        System.out.println(res);
    }
    static int gcdFun(int a, int b) {
        int res = Math.min(a,b);
        while(res > 0) {
            if(a%res == 0 && b%res == 0) {
                break;
            }
            res--;
        }
        return res;
    }
}
