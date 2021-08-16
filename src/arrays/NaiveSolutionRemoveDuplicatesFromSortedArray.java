package arrays;

import java.util.Scanner;

//TC- O(n) & AS-O(n)
public class NaiveSolutionRemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int res = getDuplicatesFromSortedArray(arr);
        System.out.println(res);
    }
    static int getDuplicatesFromSortedArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        temp[0] = arr[0];
        int res = 1;

        for(int i = 1; i < n; i++) {
            if(temp[res-1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }

        for(int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }

        System.out.println();

        for(int x: temp) {
            System.out.print(x + " ");
        }

        System.out.println();

        return res;
    }
}
