package Heaps;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        MinHeap heap = new MinHeap();
//        heap.add(10);
//        heap.add(12);
//        heap.add(15);
//        heap.add(3);
//        heap.add(6);
//        heap.add(1);
//
////        System.out.println(heap.get());
////        System.out.println(heap.remove());
//        while (!heap.isEmpty()){
//            System.out.print(heap.remove() + " ");
//        }

//        int[] arr = {10 , 2 , 40 , 1 , 2 , 59};
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        for (int data : arr){
//            minHeap.add(data);
//        }
//
//        while (!minHeap.isEmpty()){
//            System.out.print(minHeap.remove() + " ");
//        }

        Car[] cars = new Car[5];
//        int[] arr = new int[5];
//        System.out.println(Arrays.toString(arr));


        for (int i = 0 ; i < cars.length ; i++){
            Car ob = new Car(i * 100 , i * 5 , "Car - " + i);
            cars[i] = ob;
        }
//        System.out.println(Arrays.toString(cars));

        PriorityQueue<Car> maxHeap = new PriorityQueue<>((a , b) -> b.rating - a.rating);
        for (Car data : cars){
            maxHeap.add(data);
        }

        while (!maxHeap.isEmpty()){
            System.out.println(maxHeap.remove());
        }
    }
}
