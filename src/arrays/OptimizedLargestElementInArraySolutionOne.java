package arrays;

import java.util.Scanner;

//TC- 0(n)
public class OptimizedLargestElementInArraySolutionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = getLargest(arr);
        System.out.println(res);
    }

    static int getLargest(int arr[]) {
        int n = arr.length;
        int res = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > arr[res])
                res = i;
        }
        return  res;
    }
}
