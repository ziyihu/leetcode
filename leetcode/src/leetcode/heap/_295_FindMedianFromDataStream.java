package leetcode.heap;

public class _295_FindMedianFromDataStream {
    PriorityQueue<Long> minHeap = new PriorityQueue<Long>((a,b)->Long.compare(a, b));
    PriorityQueue<Long> maxHeap = new PriorityQueue<Long>((a,b)->Long.compare(b, a));
    Boolean even = true;
    /** initialize your data structure here. */
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(even) {
            maxHeap.offer((long)num);
            minHeap.offer(maxHeap.poll());
        } else {
            minHeap.offer((long)num);
            maxHeap.offer(minHeap.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if (even)
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        else
            return minHeap.peek();
    }
}
