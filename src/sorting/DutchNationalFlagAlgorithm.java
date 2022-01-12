package sorting;

import java.util.Scanner;

//TC- Θ(n) & AS- Θ(1)
public class DutchNationalFlagAlgorithm {
    static void getResult(int[] arr) {
        int n = arr.length;
        int low = 0, high = n-1, mid = 0;

        while (mid <= high) {
            if(arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }else if(arr[mid] == 1) {
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
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

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
