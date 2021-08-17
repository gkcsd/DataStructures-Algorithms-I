package arrays;

import java.util.Scanner;

//TC- 0(nd) & AS- 0(1)
public class NaiveSolutionLeftRotateArrayByD {
    static void leftRotateOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    static void leftRotateByD(int[] arr, int d) {
        for(int i =0; i < d; i++) {
            leftRotateOne(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int d = sc.nextInt();

        leftRotateByD(arr,d);
        for(int x: arr)
            System.out.print(x + " ");
    }
}
