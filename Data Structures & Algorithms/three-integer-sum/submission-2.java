class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int target= (~(nums[i] - 1));
 
            int l=i+1,r=nums.length-1;
            while(l<r){
               int currentSum=nums[l]+nums[r];
               if(currentSum<target){
                  l++;
               }
               else if(currentSum>target){
                r--;
               }
               else{
                  List<Integer> innerList=new ArrayList<>();
                  innerList.add(nums[i]);
                  innerList.add(nums[l]);
                  innerList.add(nums[r]);
                  if(!result.contains(innerList)){
                     result.add(innerList);
                  }
                  l++;
                  r--;
                  while (l<r && nums[l] == nums[l-1]){l++;}    
               }
               
            }
        }
        return result;
    }
}