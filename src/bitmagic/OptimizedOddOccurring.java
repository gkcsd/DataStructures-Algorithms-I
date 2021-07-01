package bitmagic;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class OptimizedOddOccurring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int res=findOddOccurring(arr,n);
        System.out.println(res);
    }
    static int findOddOccurring(int arr[], int n) {
        int res=0;
        for(int i=0; i<n; i++) {
            res=res^arr[i];
        }
        return res;
    }
}
