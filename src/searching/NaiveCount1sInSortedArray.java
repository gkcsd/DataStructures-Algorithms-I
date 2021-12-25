package searching;

import java.util.Scanner;

//TC- O(log(n)) & AS- O(1)
public class NaiveCount1sInSortedArray {
    static int getOnesOccur(int[] arr) {
        int n = arr.length, low = 0, high = n-1;

        while(low <= high) {
            int mid = (high+low)/2;

            if(arr[mid] == 0) {
                low = mid+1;
            }else {
                if(mid == 0 || (arr[mid-1] != arr[mid])) {
                    return (n-mid);
                }else {
                    high = mid-1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = getOnesOccur(arr);
        System.out.println(res);
    }
}
