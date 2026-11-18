class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for(String st: strs){
            char[] sorted = st.toCharArray();
            Arrays.sort(sorted);

            String sortedWord = new String(sorted);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(st);
        }
        return new ArrayList<>(map.values());
    }
}
