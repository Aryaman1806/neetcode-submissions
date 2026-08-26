class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> st = new HashSet<>();

        for(int n : nums){
            st.add(n);
        }

        int longest = 0;

        for(int n : nums){
            if(!st.contains(n - 1)){ // identifying the start of the sequence
                int length = 1;

                while(st.contains(n + length)){
                    length++;
                }

                longest = Math.max(longest,length);
            }
        }

        return longest;
    }
}
