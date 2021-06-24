package bitmagic;

import java.util.Scanner;

//TC- 0(1) & As- O(1)
public class CountSetBitsLookupTableMethodSolution {
    static int[] table = new int[256];

    static void initialize() {
        table[0] = 0;
        for(int i = 0; i < 256; i++) {
            table[i] = (i&1) + table[i/2];
        }
    }
    static int countSetBit(int n) {
        return table[n & 0xff] + table[(n>>8) & 0xff] + table[(n>>16) & 0xff] + table[(n>>24)];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        initialize();
        int res = countSetBit(n);
        System.out.println(res);
    }
}
