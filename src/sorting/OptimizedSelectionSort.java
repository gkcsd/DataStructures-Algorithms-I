package sorting;

import java.util.Scanner;

//TC- O(n*n) & AS- O(1)
public class OptimizedSelectionSort {
    static void getResult(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            int minVal = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minVal]) {
                    minVal = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minVal];
            arr[minVal] = temp;
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
