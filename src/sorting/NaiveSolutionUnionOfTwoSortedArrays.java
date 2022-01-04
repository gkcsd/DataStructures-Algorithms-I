package sorting;

import java.util.Arrays;
import java.util.Scanner;

//TC- O((m+n)*log(m+n)) & AS- O(m+n)
public class NaiveSolutionUnionOfTwoSortedArrays {
    static void printUnion(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int[] c = new int[m+n];

        for(int i = 0; i < m; i++) {
            c[i] = a[i];
        }
        for(int i = 0; i < n; i++) {
            c[m+i] = b[i];
        }

        Arrays.sort(c);

        for(int i = 0; i < m+n; i++) {
            if(i == 0 || c[i] != c[i-1]) {
                System.out.print(c[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for(int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        printUnion(a, b);
    }
}
