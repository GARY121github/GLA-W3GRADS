package Heaps;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array_215 {
    class Solution {
        public int findKthLargest(int[] arr, int k) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int i = 0 ; i < k ; i++){
                minHeap.add(arr[k]);
            }

            for (int i = k ; i < arr.length ; i++){
                if(arr[i] > minHeap.peek()){
                    minHeap.remove();
                    minHeap.add(arr[i]);
                }
            }

            return minHeap.peek();
        }
    }
}
