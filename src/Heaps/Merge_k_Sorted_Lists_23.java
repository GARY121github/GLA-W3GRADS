package Heaps;

import java.util.List;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists_23 {
     public class ListNode {
     int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a , b) -> a.val - b.val);
            for (ListNode head : lists){
                minHeap.add(head);
            }

            ListNode dummyHead = new ListNode(-1);
            ListNode h3 = dummyHead;

            while (!minHeap.isEmpty()){
                ListNode curr = minHeap.remove();
                h3.next = curr;

                h3 = h3.next;
                if(curr.next != null){
                    minHeap.add(curr.next);
                }
            }

            ListNode newHead = dummyHead.next;
            dummyHead.next = null;
            return  newHead;
        }
    }
}
