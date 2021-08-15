package arrays;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class NaiveReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        getReverseArray(arr);
        for(int item: arr)
            System.out.print(item + " ");
    }
    static void getReverseArray(int[] arr) {
       int low = 0, high = arr.length-1;

       while(low < high) {
           int temp = arr[low];
           arr[low] = arr[high];
           arr[high] = temp;
           low++;
           high--;
       }
       for(int item: arr)
           System.out.print(item + " ");
    }
}
