package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_Median_from_Data_Stream_295 {
    class MedianFinder {
        private PriorityQueue<Integer> maxHeap;
        private PriorityQueue<Integer> minHeap;
        public MedianFinder() {
            this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            this.minHeap = new PriorityQueue<>();
        }

        public void addNum(int num) {
            this.maxHeap.add(num);
            this.minHeap.add(this.maxHeap.remove());
            if(this.minHeap.size() > this.maxHeap.size()){
                this.maxHeap.add(this.minHeap.remove());
            }
        }

        public double findMedian() {
            if(this.maxHeap.size() > this.minHeap.size()){
                return this.maxHeap.peek();
            }
            else{
                return (this.maxHeap.peek() + this.minHeap.peek()) / 2.0;
            }
        }
    }

}
