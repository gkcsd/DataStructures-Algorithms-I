package mathematics;

import java.util.Scanner;

//TC- O(sqrt(n)) & AS- O(1)
public class OptimizedDivisorsSolutionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printDivisors(n);
    }
    static void printDivisors(int n){
        int i;
        for(i = 1; i*i < n; i++) {
            if(n%i == 0) {
                System.out.print(i + " ");
            }
        }
        for( ; i >= 1; i--) {
            if(n%i == 0) {
                System.out.print(n/i + " ");
            }
        }
    }
}
