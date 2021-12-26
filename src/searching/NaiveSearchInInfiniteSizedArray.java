package searching;

import java.util.Scanner;

//TC- O(pos) & AS- O(1)
public class NaiveSearchInInfiniteSizedArray {
    static int getSearchElem(int[] arr, int x) {
        int i = 0;
        while(true) {
            if(arr[i] == x) return i;
            if(arr[i] > x) return -1;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5};
        int x = 4;

        int res = getSearchElem(arr, x);
        System.out.println(res);
    }
}
