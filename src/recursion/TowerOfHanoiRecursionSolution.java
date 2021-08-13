package recursion;

import java.util.Scanner;

public class TowerOfHanoiRecursionSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoiFun(n,'A','B','C');
    }
    static void towerOfHanoiFun(int n, char A, char B, char C) {

        if(n == 1) {
            System.out.println("Move HERE 1 From " + A + " To " + C);
            return;
        }

        towerOfHanoiFun(n-1, A, C, B);
        System.out.println("Move " + n + " From " + A + " To " + C);
        towerOfHanoiFun(n-1, B, A, C);
    }
}
