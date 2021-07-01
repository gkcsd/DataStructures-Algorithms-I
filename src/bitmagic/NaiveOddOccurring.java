package bitmagic;

import java.util.Scanner;

//TC- O(n^2) & AS- O(1)
public class NaiveOddOccurring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        oddOccurring(arr,n);
    }
    static void oddOccurring(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            int count=0;
            for(int j=0; j<n; j++) {
                if(arr[j]==arr[i])
                    count++;
            }
            if(count%2 != 0)
                System.out.println(arr[i]);
        }
    }
}
