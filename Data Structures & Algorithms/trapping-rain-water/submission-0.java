class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n==0) return 0;
        int total = 0;
        for(int i=1;i<n-1;i++){
            int leftMax =0;
            for(int j=0;j<=i;j++){
                leftMax = Math.max(leftMax,height[j]);
            }
            int rightMax =0;
            for(int j=i;j<n;j++){
                rightMax = Math.max(rightMax,height[j]);
            }
            int waterLevel = Math.min(leftMax,rightMax);
            total += waterLevel-height[i];
        }
        return total;
    }
}
