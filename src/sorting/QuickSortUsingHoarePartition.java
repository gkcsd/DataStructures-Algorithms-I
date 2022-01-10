package sorting;

import java.util.Scanner;

public class QuickSortUsingHoarePartition {
    static int partitionHoare(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l-1, j = (h+1);

        while(true) {
            do {
                i++;
            }while(arr[i] < pivot);

            do {
                j--;
            }while(arr[j] > pivot);

            if(i >= j) {
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void quickSort(int[] arr, int l, int h) {
        if(l < h) {
            int p = partitionHoare(arr, l, h);
            quickSort(arr, l, p);
            quickSort(arr, p+1, h);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int h = sc.nextInt();

        quickSort(arr, l, h);

        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
