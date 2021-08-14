package arrays;

import java.util.Scanner;

//TC- O(n^2)
public class NaiveLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(largestElement(arr));
    }
    static int largestElement(int arr[]) {
        int n = arr.length;
        for(int i=0; i < n; i++) {
            boolean flag = true;
            for(int j = 0; j < n; j++) {
                if(arr[j] > arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return i;
            }
        }
        return -1;
    }
}
