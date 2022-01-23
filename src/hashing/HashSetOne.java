package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOne {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("Ganesh");
        h.add("Kale");
        h.add("CSE");

        System.out.println(h);

        System.out.println(h.contains("CSE"));

        Iterator<String> i = h.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
