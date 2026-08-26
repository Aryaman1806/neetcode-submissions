class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        Set<Integer> st = new HashSet<>();

        for(int n : nums){
            st.add(n);
        }

        int longest = 0;

        for(int c : st){
            if(!st.contains(c -1)){
                int length = 1;

                while(st.contains(c+length)){
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
        
    }
}
