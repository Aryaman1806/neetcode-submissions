class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> st = new HashSet<>();

        for(int n : nums){
            st.add(n);
        }

        int longest = 0;

        for( int n : st){

            if(!st.contains(n-1)){
                int num = n;
                int count = 1;
                while(st.contains(num+1)){
                    num++;
                    count++;
                }
                longest = Math.max(count, longest);
            }
            
        }

        return longest;
        
    }
}
