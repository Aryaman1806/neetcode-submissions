class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mp = new LinkedHashMap<>();

        for( String s : strs){
            int[] count = new int[26];

            for(int i = 0; i < s.length(); i++){
                count[s.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(count);

            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(s);
        }

        return new ArrayList<>(mp.values());
        
    }
}
