package arrays;

import java.util.Scanner;

//TC- 0(d+n-d+d) => 0(n-d) ==> 0(n) & AS- 0(d)
public class OptimizedSolutionLeftRotateArrayByD {
    static void leftRotateArrayByD(int[] arr, int d) {
        int n =arr.length;
        int[] temp = new int[d];

        //0(d)
        for(int i = 0; i < d; i++) {
            temp[i]= arr[i];
        }

        //0(n-d)
        for(int i = d; i < n; i++) {
            arr[i-d]= arr[i];
        }

        //0(d)
        for(int i=0; i<d; i++) {
            arr[n-d+i] = temp[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int d = sc.nextInt();
        leftRotateArrayByD(arr, d);

        for(int x: arr)
            System.out.print(x + " ");
    }
}
