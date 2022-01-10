package sorting;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedSortAnArrayWithTwoTypesOfElement {
    static void getResult(int[] arr) {
        int n = arr.length;

        int i = -1, j = n;

        while(true) {
            do {
                i++;
            }while(arr[i] < 0);

            do {
                j--;
            }while(arr[j] > 0);

            if(i >= j) {
                return;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
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
    }
}
