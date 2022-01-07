package sorting;

import java.util.Scanner;
//This program has error, we resolve later..
public class OptimizedCountInversionInArray {
    static int countInversion(int[] arr, int l, int r) {
        int res = 0;
        if(l < r) {
            int mid = l + (r-l)/2;

            res += countInversion(arr, l, mid);
            res += countInversion(arr, mid, r);

            res += countAndMerge(arr, l, mid, r);
        }

        return res;
    }

    static int countAndMerge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1, n2 = r-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1; i++) {
            left[i] = arr[i+l];
        }
        for(int j = 0; j < n2; j++) {
            right[j] = arr[mid+1+j];
        }

        int res = 0, i = 0, j = 0, k = 0;

        while(i < n1 && j < n2) {
            if(arr[i] <= arr[j]) {
                arr[k] = left[i];
                i++;
                k++;
            }else {
                arr[k] = right[j];
                j++;
                k++;
                res = res + (n1-i);
            }
        }

        while(i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = sc.nextInt();
        int r = sc.nextInt();

        int res = countInversion(arr, l, r);
        System.out.println(res);
    }
}
