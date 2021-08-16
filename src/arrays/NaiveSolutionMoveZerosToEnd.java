package arrays;

import java.util.Scanner;

//TC- O(n^2) & AS- O(1)
public class NaiveSolutionMoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        getMoveZerosToEnd(arr);
    }
    static void getMoveZerosToEnd(int[] arr) {
        int n=arr.length;

        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                for(int j=i+1; j<n; j++) {
                    if(arr[j] != 0) {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for(int x:arr)
            System.out.print(x + " ");
    }
}
