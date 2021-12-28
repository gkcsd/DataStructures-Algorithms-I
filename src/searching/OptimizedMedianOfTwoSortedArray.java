package searching;

import java.util.Scanner;

//TC- O(log(n1)) & AS- O(1)
public class OptimizedMedianOfTwoSortedArray {
    static double getMedian(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int begin1 = 0, end1 = n1;

        while(begin1 <= end1) {
            int i1 = (begin1+end1)/2;
            int i2 = ((n1+n2+1)/2) - i1;


            int min1 = (i1 == n1) ? Integer.MAX_VALUE : arr1[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : arr1[i1-1];

            int min2 = (i2 == n2) ? Integer.MAX_VALUE : arr2[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : arr2[i2-1];


            if(max1 <= min2 && max2 <= min1) {
                if((n1+n2)%2 == 0) {
                    return ((double) Math.max(max1, max2) + Math.min(min1, min2))/2;
                }else {
                    return (double) Math.max(max1, max2);
                }
            }else if(max1 > min2) {
                end1 = i1-1;
            }else {
                begin1 = i1+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 =  new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        double res = getMedian(arr1, arr2);
        System.out.println(res);
    }
}
