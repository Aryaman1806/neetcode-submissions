class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> noDupe = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if (noDupe.contains(nums[i])){
                return true;
            }
            noDupe.add(nums[i]);
        }
        return false;
    }
}
