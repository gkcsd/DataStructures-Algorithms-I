package recursion;

public class RecursivePracticeFour {
    public static void main(String[] args) {
        fun(7);
    }
    static void fun(int n) {
        if(n == 0) {
            return;
        }
        fun(n/2);
        System.out.println(n%2);
    }
}
