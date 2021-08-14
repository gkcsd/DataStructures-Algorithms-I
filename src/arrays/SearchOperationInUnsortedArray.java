package arrays;

import java.util.Scanner;

//TC- 0(n)
public class SearchOperationInUnsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int res = searchItem(arr,n,x);
        System.out.println(res);
    }
    static int searchItem(int arr[], int n, int x) {
        for(int i = 0; i< n; i++) {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
}
