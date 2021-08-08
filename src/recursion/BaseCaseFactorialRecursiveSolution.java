package recursion;

import java.util.Scanner;

public class BaseCaseFactorialRecursiveSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = factNum(n);
        System.out.println(res);
    }
    static int factNum(int n) {
        if(n == 0 || n == 1) //this is the base case after which program will not crash
            return 1;

        return n*factNum(n-1);
    }
}
