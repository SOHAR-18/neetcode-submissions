class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        for(int i=1;i<=n;i++){
            int x=i;
            int res =0;
            while(x!=0){
                 x = x&(x-1);
                 res++;
            }
        a[i] = res;
        }
        return a;
    }
}
