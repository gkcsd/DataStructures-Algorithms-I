package mathematics;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class NaiveDivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printDivisors(n);
    }
    static void printDivisors(int n) {
        for(int i = 1; i <= n; i++) {
            if(n%i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
