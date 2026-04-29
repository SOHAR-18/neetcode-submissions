class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> A = new HashMap<>();
        for(String s : strs){
            char[] Arr = s.toCharArray();
            Arrays.sort(Arr);
            String st = new String(Arr);
            A.putIfAbsent(st, new ArrayList<>());
            A.get(st).add(s);
        }
     return new ArrayList<>(A.values());
    }
}
