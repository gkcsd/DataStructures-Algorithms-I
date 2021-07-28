package recursion;


//Its not perfect program
public class DirectRecursiveProgram {
    public static void main(String[] args) {
        fun1();
    }
    static void fun1() {
        System.out.println("Hello World!");
        fun1();
    }
}
