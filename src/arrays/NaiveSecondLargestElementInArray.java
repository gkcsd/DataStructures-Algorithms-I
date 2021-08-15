package arrays;

import java.util.Scanner;

public class NaiveSecondLargestElementInArray {
    static int getSecondLargestElement(int[] arr, int n) {
        int largest = getLargestElement(arr, n);
        int res = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] != arr[largest]) {
                if(res == -1)
                    res = i;
                else if(arr[i] > arr[largest])
                    res = i;
            }
        }
        return largest;
    }

    static int getLargestElement(int[] arr, int n) {
        int largest = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int[] arr = new int[val];
        for(int i = 0; i<val; i++) {
            arr[i] =sc.nextInt();
        }
        int n = arr.length;
        int res = getSecondLargestElement(arr, n);
        System.out.println(res);
    }
}