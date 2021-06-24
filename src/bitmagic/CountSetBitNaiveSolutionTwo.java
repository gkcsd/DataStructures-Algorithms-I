package bitmagic;

import java.util.Scanner;

//TC- 0(total bits in n) & As- O(1)
public class CountSetBitNaiveSolutionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = countSetBits(n);
        System.out.println(ans);
    }
    static int countSetBits(int n) {
        int res = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                res++;
            }
            n = n >> 1;
        }
        return res;
    }
}
