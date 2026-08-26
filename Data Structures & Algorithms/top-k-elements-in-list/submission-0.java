class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> tally = new HashMap<>();
        int[] result = new int[k];
        for(int i = 0; i < nums.length; i++){
            tally.put(nums[i], tally.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b) -> a.getValue().equals(b.getValue()) ? Integer.compare(b.getKey(), a.getKey()): Integer.compare(b.getValue(), a.getValue()));

        for(Map.Entry<Integer,Integer> entry: tally.entrySet()){
            queue.offer(entry);
        }
        for(int i = 0; i < k; i++){
            result[i] = queue.poll().getKey();
        }
        return result;
    }
}
