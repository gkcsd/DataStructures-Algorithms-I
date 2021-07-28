package recursion;


public class DirectRecursiveProgramTwo {
    public static void main(String[] args) {
        fun1(5);
    }
    static void fun1(int n) {
        if(n == 0) {
            return;
        }
        System.out.println("Hello World!");
        fun1(n-1);
    }
}
