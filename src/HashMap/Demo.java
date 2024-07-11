package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
//        HashMap<String , Integer> map = new HashMap<>();

//        TreeMap<String , Integer> map = new TreeMap<>();
        LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
        map.put("Tata" , 100);
        map.put("Tesla" , 90);
        map.put("Microsoft" , 95);
//        map.put("Microsoft" , 105);
//        map.put(null , 150);

//        System.out.println(map.get("Tata"));
//
        for (String key : map.keySet()){
            System.out.println("Key -> " + key + " Value -> " + map.get(key));
        }

//        System.out.println(map.containsKey("jdbgdjbg"));
//        System.out.println(map);

    }
}
