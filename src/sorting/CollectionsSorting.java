package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(5);
        li.add(20);

        Collections.sort(li);
        System.out.println(li);

        Collections.sort(li, Collections.reverseOrder());
        System.out.println(li);
    }
}
