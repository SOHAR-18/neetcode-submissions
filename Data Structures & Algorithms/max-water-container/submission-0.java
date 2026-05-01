class Solution {
    public int maxArea(int[] heights) {
        int a = heights.length;
        int l =0;
        int r = a-1;
        int max =0;
        while(l<r){
            int h = Math.min(heights[l],heights[r]);
            int w = r-l;
            max= Math.max(max,h*w);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
