package sorting;

import java.util.Scanner;

//TC- O(m+n) & AS- O(1)
public class OptimizedSolutionUnionOfTwoSortedArrays {
    static void printUnion(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int i = 0, j = 0;

        while(i < m && j < n) {
            if((i > 0) && (a[i] == a[i-1])) {
                i++;
                continue;
            }
            if(j > 0 && b[j] == b[j-1]) {
                j++;
                continue;
            }

            if(a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            }else if(a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            }else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }

        while(i < m) {
            if(i > 0 && a[i] != a[i-1]) {
                System.out.print(a[i] + " ");
                i++;
            }
        }
        while(j < n) {
            if(j > 0 && b[j] != b[j-1]) {
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int  i = 0; i < n1; i++) {
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
