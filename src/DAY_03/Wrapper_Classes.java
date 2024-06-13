package DAY_03;

public class Wrapper_Classes {
    public static void main(String[] args) {

////        created in Stack memory
//        int a = 10;
//
////        created in Heap memory
//        Integer b = 20;
//
//        int[] arr = { 1 , 2 , 3 , 4 , 5 };
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(arr);

        int a = 10;
        int b = 10;

        System.out.println(a == b);

        Integer A = 20;
        Integer B = 20;

        System.out.println(A == B);

        Integer C = 150;
        Integer D = 150;
        System.out.println(C == D);

//        Integer , Short , Long , Byte -> range [-128, 127] must be interned (JLS7 5.1.7)
    }
}
