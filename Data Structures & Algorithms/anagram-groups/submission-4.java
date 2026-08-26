class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mp = new LinkedHashMap<>();

        for( String s : strs){
            char[] st = s.toCharArray();
            Arrays.sort(st);
            String key = new String(st);

            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(s);
        }

        return new ArrayList<>(mp.values());
        
    }
}
