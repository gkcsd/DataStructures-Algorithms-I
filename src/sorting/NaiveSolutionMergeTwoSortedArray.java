package sorting;

import java.util.Arrays;
import java.util.Scanner;

//TC- O((m+n)*log(m+n)) & AS- Θ(m+n)
public class NaiveSolutionMergeTwoSortedArray {
    static void getResult(int[] a, int[] b) {
        int n = a.length, m = b.length;

        int[] c = new int[m+n];

        for(int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for(int i = 0; i < m; i++) {
            c[n+i] = b[i];
        }

        Arrays.sort(c);

        for(int i = 0; i < m+n; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        getResult(a, b);
    }
}
