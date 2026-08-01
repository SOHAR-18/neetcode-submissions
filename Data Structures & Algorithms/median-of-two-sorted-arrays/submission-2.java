class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i=0,j=0;
        int m1 =0, m2 =0;
        for(int c =0; c<(l1+l2)/2 +1; c++){
            m2 = m1;
            if(i<l1 && j< l2){
                if(nums1[i] > nums2[j]){
                    m1 = nums2[j];
                    j++;
                }else{
                    m1 = nums1[i];
                    i++;
                }
            }else if(i<l1){
                m1 = nums1[i];
                i++;
            }else{
                m1 = nums2[j];
                j++;
            }
        }
        if((l1+l2)%2 ==1){
            return (double) m1;
        }else{
            return (m1+m2) / 2.0;
        }
    }
}
