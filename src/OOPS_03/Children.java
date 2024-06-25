package OOPS_03;

public class Children extends Parent{
    int c = 50;
    int d = 60;
    int e = 70;

    public void printAddition(){
//        System.out.println(c + d + e);
        System.out.println(c);
        System.out.println(super.c);
//        System.out.println(super.);
    }

    @Override
    public void print(){
        System.out.println(this.c + " " + this.d +  " " + this.e);
    }

    @Override
    public String toString(){
        return "Children -> " + this.a + " " + this.b + " " + this.c + "Parent " + super.a + " " + super.b + " " + super.c;
    }
}
