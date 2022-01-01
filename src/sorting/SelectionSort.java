package sorting;

import java.util.Scanner;

//TC- O(n*n) & AS- O(n)
public class SelectionSort {
    static void getResult(int[] arr) {
        int n = arr.length;

        int[] temp = new int[n];

        for(int i = 0;i < n; i++) {
            int minVal = 0;
            for(int j = 1; j < n; j++) {
                if(arr[j] < arr[minVal]) {
                    minVal = j;
                }
            }
            temp[i] = arr[minVal];
            arr[minVal] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
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
