class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<>();

        backtrack(nums, 0, target, subset, result);
        return result;        
    }

    public void backtrack(int[] nums, int index, int target, List<Integer> subset, List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList(subset));
        } else if (target < 0 || index >= nums.length){
            return;
        }else {
            subset.add(nums[index]);
            backtrack(nums, index, target - nums[index], subset, result);

            subset.remove(subset.size() - 1);
            backtrack(nums, index + 1, target, subset, result);
        }
    }
}