package OOPS_01;

public class Final_Demo {
    public static void main(String[] args) {
//        Constants ob = new Constants();
//        System.out.println(ob.MaxValue);

//        final Constants ob2 = new Constants();
//        System.out.println(ob2.MinValue);
//
//        ob2.MinValue = 5000;
//        System.out.println(ob2.MinValue);
//
//        ob2 = new Constants();

        Constants finalise;
        for(int i = 1 ; i < 10000000 ; i++){
            finalise = new Constants();
        }
    }
}
