class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Traverse the array
        for (int num : nums) {
            minHeap.add(num); // Add the current number to the heap
            // If the heap size exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll(); // This removes the smallest element in the heap
            }
        }
        
        // The root of the Min-Heap is the kth largest element
        return minHeap.peek();
}
}