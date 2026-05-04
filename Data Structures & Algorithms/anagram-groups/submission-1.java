class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){

            int[] str = new int[26];
            for(char c : s.toCharArray()){
                str[c - 'a']++ ;
            }
            String key = Arrays.toString(str);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
      
    }
}
