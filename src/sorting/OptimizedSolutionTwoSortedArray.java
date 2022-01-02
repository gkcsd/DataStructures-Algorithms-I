package sorting;

import java.util.Scanner;

//TC- Θ(n+m) & AS- O(1)
public class OptimizedSolutionTwoSortedArray {
    static void getResult(int[] a, int[] b) {
        int m = a.length, n = b.length, i = 0, j = 0;

        while((i < m) && (j < n)) {
            if(a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            }else {
                System.out.print(b[j] + " ");
                j++;
            }
        }

        while(i < m) {
            System.out.print(a[i] + " ");
            i++;
        }
        while(j < n) {
            System.out.print(b[j] + " ");
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a = new int[m];
        for(int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        getResult(a, b);
    }
}
