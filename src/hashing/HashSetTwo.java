package hashing;

import java.util.HashSet;

public class HashSetTwo {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("This");
        h.add("Is");
        h.add("Cool");
        h.add("You");
        h.add("Know");

        System.out.println(h.size());

        h.remove("Is");

        System.out.println(h.size());

        for(String s : h) {
            System.out.print(s + " ");
        }

        System.out.println(h.isEmpty());
    }
}
