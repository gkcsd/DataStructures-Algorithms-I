package sorting;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1) BUT Its work in linear time on an average case....
public class OptimizedKthSmallestElement {
    static int partitionLomuto(int[] arr, int l, int h) {
        int i = l-1;
        int p = arr[h];

        for(int j = l; j <= h-1; j++) {
            if(arr[j] < p) {
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

    static int getResult(int[] arr, int k) {
        int l = 0, r = arr.length-1;

        while(l <= r) {
            int pivot = partitionLomuto(arr, l, r);

            if(pivot == k-1) {
                return pivot;
            }else if(pivot > k-1) {
                r = pivot-1;
            }else {
                l = pivot+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int res = getResult(arr, k);
        System.out.println(res);
    }
}
