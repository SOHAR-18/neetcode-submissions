class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int num : stones){
            a.add(num);
        }

        while(a.size()>1){
        Collections.sort(a);
        int x = a.remove(a.size()-1);
        int y = a.remove(a.size()-1);
        int z = x-y;
        if(z !=0){
            a.add(z);
        }
        }
        return a.isEmpty() ? 0 : a.get(0);
        
    }
}
