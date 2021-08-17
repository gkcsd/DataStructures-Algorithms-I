package arrays;

import java.util.Scanner;

//TC- 0(d+n-d+n) => 0(2n) ==> 0(n) & AS- 0(1)
public class ReverseAlgorithmsOptimizedSolutionLeftRotateArrayByD {
    static void reverseAlgoLeftRotate(int[] arr, int d) {
        int n = arr.length;
        reverse(arr, 0, d-1); //0(d)
        reverse(arr, d, n-1); //0(n-d)
        reverse(arr, 0, n-1); //0(n)
    }

    private static void reverse(int[] arr, int low, int high) {
        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d=sc.nextInt();
        reverseAlgoLeftRotate(arr, d);

        for(int x: arr)
            System.out.print(x + " ");
    }
}
