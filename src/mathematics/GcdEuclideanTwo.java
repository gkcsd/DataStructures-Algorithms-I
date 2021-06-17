package mathematics;

import java.util.Scanner;

//TC- O(log(max(a,b))) & AS- O(1)
public class GcdEuclideanTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = gcdESol(a,b);
        System.out.println(res);
    }
    static int gcdESol(int a, int b) {
        if(b==0)
            return a;
        else
            return gcdESol(b,a%b);
    }
}
