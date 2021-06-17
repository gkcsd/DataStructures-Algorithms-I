package mathematics;

import java.util.Scanner;

public class GcdEuclideanOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = gcdESol(a,b);
        System.out.println(res);
    }
    static int gcdESol(int a, int b) {
        while(a!=b) {
            if(a>b) {
                a = a-b;
            }else {
                b=b-a;
            }
        }
        return a;
    }
}
