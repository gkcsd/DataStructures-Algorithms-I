package practiceproblems;

interface ABC {
    int calculate(int x);
}

public class Demo1 {
    public static void main(String[] args) {
        int a = 5;
        ABC abc = (int x) -> x*x;
        int ans = abc.calculate(a);
        System.out.println(ans);
    }
}
