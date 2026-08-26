class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : nums){
            maxHeap.offer(n);
        }

        int max = 0;
        for(int i=0; i < k; i++){
            max = maxHeap.poll();
        }
        return max;  
    }
}
