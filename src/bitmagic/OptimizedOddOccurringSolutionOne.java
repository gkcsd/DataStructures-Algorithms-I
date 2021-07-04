package bitmagic;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedOddOccurringSolutionOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        oddAppearing(arr,n);
    }
    static void oddAppearing(int arr[], int n) {
        int xor = 0, res1=0, res2=0;
        for(int i=0; i<n; i++) xor=xor^arr[i];
        int rb=xor & ~(xor-1);
        for(int i=0; i<n; i++) {
            if((arr[i] & rb) != 0)
                res1=res1^arr[i];
            else
                res2=res2^arr[i];
        }
        System.out.print(res1 + " " + res2);
    }
}
