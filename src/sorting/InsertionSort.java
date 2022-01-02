package sorting;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class InsertionSort {
    static void getResult(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        getResult(arr);

        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
