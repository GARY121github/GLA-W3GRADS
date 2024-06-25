package OOPS_02;

public class Inner_Classes {

    static class A{
        int a = 10;
        public A(int a){
            this.a = a;
        }
    }

    public static void main(String[] args) {
        A ob1 = new A(10);
    }
}
