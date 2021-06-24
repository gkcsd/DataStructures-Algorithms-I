package bitmagic;

import java.util.Scanner;

//TC- 0(set bit count) & As- O(1)
public class CountSetBitsBrianKerningamsAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = countSetBit(n);
        System.out.println(res);
    }
    static int countSetBit(int n) {
        int res = 0;
        while(n>0) {
            n = (n & (n-1));
            res++;
        }
        return res;
    }
}
