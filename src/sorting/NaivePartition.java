package sorting;

import java.util.Scanner;

//TC- O(n) & AS- O(n)
public class NaivePartition {
    static int getResult(int[] arr, int p, int l, int h) {
        int[] temp = new int[h-l+1];
        int index = 0;

        for(int i = l; i <= h; i++) {
            if(arr[i] < arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }

        for(int i = l; i <= h; i++) {
            if(arr[i] == arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }

        int res = l+index-1;

        for(int i = l; i <= h; i++) {
            if(arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }

        for(int i = l; i <= h; i++) {
            arr[i] = temp[i-l];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p = sc.nextInt();
        int l = sc.nextInt();
        int h = sc.nextInt();

        int res = getResult(arr , p, l, h);
        System.out.println(res);
    }
}
