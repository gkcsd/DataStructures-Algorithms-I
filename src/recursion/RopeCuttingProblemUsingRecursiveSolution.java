package recursion;

import java.util.Scanner;

//TC- (3^n)
public class RopeCuttingProblemUsingRecursiveSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = maxPieces(n,a,b,c);
        System.out.println(res);
    }
    static int maxPieces(int n, int a, int b, int c) {

        if(n == 0) return 0;

        if(n < 0) return -1;

        int res = Math.max(maxPieces(n-a, a,b,c),
                Math.max(maxPieces(n-b, a,b,c),
                maxPieces(n-c, a,b,c))
            );

        if(res == -1)
            return -1;

        return res + 1;
    }
}
