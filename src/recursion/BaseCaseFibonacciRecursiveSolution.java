package recursion;

import java.util.Scanner;

//TC- O(n) AS-O(n)
public class BaseCaseFibonacciRecursiveSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = fib(n);
        System.out.println(res);
    }
    static int fib(int n) {
        if(n <= 1)  //This is the base case which handles the n == 0 and n == 1
            return n;

        return fib(n-1) + fib(n-2);
    }
}
