package HashSet;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);

//        System.out.println(set.contains(10));
//
//        set.remove(10);

        for (int i : set){
            System.out.println(i);
        }
    }
}
