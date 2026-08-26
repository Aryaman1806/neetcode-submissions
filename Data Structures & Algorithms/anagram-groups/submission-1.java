class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> mp = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);

            String sorted = new String(charArray);

            mp.putIfAbsent(sorted, new ArrayList<>());

            mp.get(sorted).add(s);
        }

        return new ArrayList<>(mp.values());
        
    }
}
