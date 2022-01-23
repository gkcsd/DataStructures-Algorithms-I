package hashing;

import java.util.HashMap;

public class HashMapTwo {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("This", 1);
        m.put("Is", 2);
        m.put("Much", 3);
        m.put("Cool", 4);

        if(m.containsKey("Is")) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        m.remove("Is");

        System.out.println(m.size());
    }
}
