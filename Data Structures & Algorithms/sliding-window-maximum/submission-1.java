class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] a = new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            int max = Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                if(nums[j] > max){
                    max = nums[j];
                }
            }
            a[i] = max;
        }
       return a;
    }
}
