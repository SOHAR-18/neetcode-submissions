class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> A = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String st = Arrays.toString(count);
            A.putIfAbsent(st, new ArrayList<>());
            A.get(st).add(s);
        }
     return new ArrayList<>(A.values());
    }
}
