package Heaps;

public class Car {
    int price;
    int rating;
    String name;

    public Car(int price , int rating , String name){
        this.price = price;
        this.rating = rating;
        this.name = name;
    }

    @Override
    public String toString(){
        return "\n name : " + name + "\n price : " + price + "\n rating : " + rating;
    }
}
