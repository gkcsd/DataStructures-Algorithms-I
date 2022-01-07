package sorting;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class LomutoPartition {
    static int getResult(int[] arr, int l, int h, int p) {
        int temp = arr[p];
        arr[p] = arr[h];
        arr[h] = temp;

        int i = l-1;

        for(int j = l; j <= h-1; j++) {
            if(arr[j] < arr[h]) {
                i++;

                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;

        return (i+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pivot = sc.nextInt();

        int res = getResult(arr, 0, n-1, pivot);
        System.out.println(res);
    }
}
