package arrays;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedSolutionMoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        getZerosAtTheEnd(arr);
    }
    static void getZerosAtTheEnd(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0; i<n; i++) {
            if(arr[i] != 0) {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
            }
        }
        for(int x: arr)
            System.out.print(x + " ");
    }
}
