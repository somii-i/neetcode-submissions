class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            int alph[] = new int[26];
            
            for(char c : s.toCharArray()){
              alph[c - 'a']++;
            }
            String key = Arrays.toString(alph);
            System.out.println(key);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
