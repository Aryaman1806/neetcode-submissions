class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> mp  = new HashMap<>();

        int n = s.length();

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(!mp.containsKey(c)){
                mp.put(c, i);
            } else{
                mp.put(c, n);
            }
        }

        int res = n;
        for(int idx : mp.values()){
            res = Math.min(idx, res);
        } 

        return res == n ? -1 : res;       
    }
}