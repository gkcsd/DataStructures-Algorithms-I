package arrays;

import java.util.Scanner;

//TC- 0(n)
public class OptimizedLargestElementInArraySolution {
    static int getSecondLargestElement(int[] arr) {
        int n = arr.length;
        int res = -1, largest = 0;

        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            }else if(arr[i] != arr[largest]) {
                if(res == -1 || arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int res = getSecondLargestElement(arr);
        System.out.println(res);
    }
}
