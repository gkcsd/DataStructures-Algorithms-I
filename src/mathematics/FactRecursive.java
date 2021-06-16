package mathematics;

import java.util.Scanner;

//TC- 0(n) and AS- 0(n)
public class FactRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = factRecur(n);
        System.out.println(res);
    }
    static int factRecur(int n) {
        if(n ==0)
            return 1;
        return n * factRecur(n-1);
    }
}
