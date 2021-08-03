package recursion;

public class RecursivePracticeThree {
    public static void main(String[] args) {
//        System.out.println(fun(16));
        System.out.println(1%2);
    }
    static int fun(int n) {
        if(n == 1)
            return 0;
        else
            return 1 + fun(n/2);
    }
}
