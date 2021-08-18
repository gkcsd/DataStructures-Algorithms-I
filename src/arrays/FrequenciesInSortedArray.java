package arrays;

import java.util.Scanner;

//TC- 0(n) & As- 0(1)
public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        getFreqInSortedArray(arr);
    }
    static void getFreqInSortedArray(int[] arr) {
        int n = arr.length;
        int freq = 1, i = 1;

        //The 'i' runs n times, and it goes up to n+1 times but not go beyond that
        while(i < n) {
            while((i < n) && (arr[i] == arr[i-1])) {
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq = 1;
        }

        if((n == 1) || (arr[n-1] != arr[n-2]))
            System.out.println(arr[n-1] + " " + 1);
    }
}
