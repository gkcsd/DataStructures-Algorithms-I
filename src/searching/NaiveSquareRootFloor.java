package searching;

import java.util.Scanner;

//TC- O(x^1/2) & AS- O(1)
public class NaiveSquareRootFloor {
    static int sqRootFloor(int x) {
        int i = 1;

        while(i*i <= x) {
            i++;
        }

        return (i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = sqRootFloor(n);
        System.out.println(res);
    }
}
