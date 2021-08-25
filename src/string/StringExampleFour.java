package string;

public class StringExampleFour {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "her";

        int res = s1.compareTo(s2);

        if(res == 0)
            System.out.println("Same");
        if(res > 0)
            System.out.println("S1 greater");
        if(res < 0)
            System.out.println("S1 smaller");

    }
}
