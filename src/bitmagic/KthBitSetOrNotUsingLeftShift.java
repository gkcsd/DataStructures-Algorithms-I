package bitmagic;

import java.util.Scanner;

//TC- O(1) & AS- O(1)
public class KthBitSetOrNotUsingLeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        kthBit(n,k);
    }
    static void kthBit(int n, int k) {
        if((n & (1<<(k-1))) != 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
