class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();

        int l = 0; 
        int res = 0;

        for(int i = 0; i < s.length(); i++){

            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(l));
                l++;
            }

            st.add(s.charAt(i));

            res = Math.max(res, i-l+1);

        }
        return res;
    }
}
