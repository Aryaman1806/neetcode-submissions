class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int n: nums){
            mySet.add(n);
        }
        int longest = 0;
        for(int s: mySet){
            if(!mySet.contains(s-1)){
                int length = 1;
                while(mySet.contains(s+length)){
                    length++;
                }
                longest = Math.max(length,longest);
            }
        }
        return longest;        
    }
}