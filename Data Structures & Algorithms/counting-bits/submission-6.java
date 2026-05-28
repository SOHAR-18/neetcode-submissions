class Solution {
    public int[] countBits(int n) {
        int[] r = new int[n+1];
        r[0]=0;
        for(int i=0;i<=n;i++){
            int num =i;
            while(num!=0){
                r[i]++;
                num = num &(num-1);
            }
        }
        return r;
    }
}
