package arrays;

import java.util.Scanner;

//Tc- 0(n)
public class DeleteOperationInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println("Before Deletion Of Element in the array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        int res = deletionOfElement(arr, n, x);
        System.out.println("The new sized of an array is " + res);
        System.out.println();
        System.out.println("The new Array after deletion of an element: ");
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
    static int deletionOfElement(int arr[], int n, int x) {
        int i;
        for(i = 0; i < n; i++) {
            if(arr[i] == x)
                break;
        }

        if(i == n)
            return n;

        for(int j = i; j < n-1; j++) {
            arr[j] = arr[j+1];
        }
        return (n-1);
    }
}
