package arrays;

import java.util.Scanner;

//TC- O(n*m) & AS- O(1)
public class NBonacciNumberWindowSlidingTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        getResult(n, m);
    }
    static void getResult(int n, int m) {
        int[] arr = new int[m];

        for(int i = 0; i < m; i++) {
            arr[i] = 0;
        }

        arr[n-1] = 1;
        arr[n] = 1;

        for(int i = n+1; i < m; i++) {
            arr[i] = 2 * arr[i-1] - arr[i - n - 1];
        }

        for(int x: arr) {
            System.out.print(x + " ");
        }

    }
}
