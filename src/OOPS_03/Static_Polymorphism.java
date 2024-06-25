package OOPS_03;

public class Static_Polymorphism {

    public Static_Polymorphism(){

    }

    public Static_Polymorphism(int a , int b){

    }

    public Static_Polymorphism(int a , int b , int c){

    }
    public int add(int a , int b){
        return a + b;
    }

    public int add(int a , int b , int c){
        return a + b + c;
    }

    public int add(int a , int b , int c , int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Static_Polymorphism ob = new Static_Polymorphism();
        System.out.println(ob.add(1 , 2));
        System.out.println(ob.add(10 , 20 ,30 ));
    }
}
