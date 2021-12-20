package arrays;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedMinimumConsecutiveFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printGroups(arr);
    }
    static void printGroups(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            if(arr[i] != arr[i-1]) {
                if(arr[i] != arr[0]) {
                    System.out.print("From " + i + " to ");
                }else{
                    System.out.println(i-1);
                }
            }
        }
        if(arr[n-1] != arr[0]) {
            System.out.print(n-1);
        }
    }
}
