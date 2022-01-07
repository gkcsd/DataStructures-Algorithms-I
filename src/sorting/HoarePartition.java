package sorting;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class HoarePartition {
    static int getResult(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l-1, j = h+1;

        while(true) {

            do {
                i++;
            }while(arr[i] < pivot);

            do {
                j--;
            }while (arr[j] > pivot);

            if(j <= i) {
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = getResult(arr, 0, n-1);
        System.out.println(res);
    }
}
