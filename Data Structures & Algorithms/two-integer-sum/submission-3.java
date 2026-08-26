class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> rec = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(rec.containsKey(diff)){
                return new int[]{rec.get(diff), i};
            }

            rec.put(nums[i], i);
        }

        return new int[]{};
        
    }
}
