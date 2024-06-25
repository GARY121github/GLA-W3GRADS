package OOPS_02;

public class Static_Class {
    static int count = 10;

    int age;

    static {
        System.out.println("Inside Static Block");
    }

    public Static_Class(int age){
        System.out.println("Inside Constructor");
        this.age = age;
        Static_Class.count++;
    }

    public void print(){
        System.out.println(this.age);
        System.out.println("Count is -> " + Static_Class.count);
    }
}
