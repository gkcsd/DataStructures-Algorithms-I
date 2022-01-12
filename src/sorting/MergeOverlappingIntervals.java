package sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

//TC- O(n(log(n))) & AS- O(1)
class Interval implements Comparable<Interval> {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public int compareTo(Interval obj) {
        return this.start - obj.start;
    }
}

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total pairs: ");
        int n = sc.nextInt();

        Interval[] arr = new Interval[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i+1) + " Pair values: ");
            arr[i] = new Interval(sc.nextInt(), sc.nextInt());
        }

        mergeIntervals(arr, n);
    }

    static void mergeIntervals(Interval[] arr, int n) {
        Arrays.sort(arr);

        int res = 0;

        for(int i = 1; i < n; i++) {
            if(arr[res].end >= arr[i].start) {
                arr[res].end = Math.max(arr[res].end, arr[i].end);
                arr[res].start = Math.min(arr[res].start, arr[i].start);
            }else {
                res++;
                arr[res] = arr[i];
            }
        }

        for(int i = 0; i <= res; i++) {
            System.out.println("[" + arr[i].start + ", " + arr[i].end + "]");
        }
    }
}
