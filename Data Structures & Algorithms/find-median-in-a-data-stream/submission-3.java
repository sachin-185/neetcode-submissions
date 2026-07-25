public class MedianFinder {
    private Queue<Integer> smallHeap; 
    private Queue<Integer> largeHeap; 

    public MedianFinder() {
        smallHeap = new PriorityQueue<>(Collections.reverseOrder());
        largeHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(smallHeap.isEmpty() || num <= smallHeap.peek()) smallHeap.add(num);
        else largeHeap.add(num);
        
        if (smallHeap.size() > largeHeap.size()+1) largeHeap.add(smallHeap.poll());
        else if (largeHeap.size() > smallHeap.size()) smallHeap.add(largeHeap.poll());
    }

    public double findMedian() {
        if (smallHeap.size() > largeHeap.size()) return smallHeap.peek();
        return (smallHeap.peek() + largeHeap.peek()) / 2.0;
    }
}