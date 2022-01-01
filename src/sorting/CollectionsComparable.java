package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PointTwo implements Comparable<PointTwo> {
    int x;
    int y;
    PointTwo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int compareTo(PointTwo p) {
        System.out.println(this.x + " " + p);
        System.out.println(this.x - p.x);
        return this.x - p.x;
    }
}

public class CollectionsComparable {
    public static void main(String[] args) {
        List<PointTwo> li = new ArrayList<>();
        li.add(new PointTwo(5, 10));
        li.add(new PointTwo(2, 20));
        li.add(new PointTwo(10, 30));

        Collections.sort(li);

        for(PointTwo p: li) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
