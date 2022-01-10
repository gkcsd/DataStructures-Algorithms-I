package sorting;

import java.util.Scanner;

public class QuickSortUsingLomutoPartition {
    static int partitionLomuto(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l-1;

        for(int j = l; j <= h-1; j++) {
            if(arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;

        return (i+1);
    }

    static void quickSort(int[] arr, int l, int h) {
        if(l < h) {
            int p = partitionLomuto(arr, l, h);
            quickSort(arr, l, p-1);
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
