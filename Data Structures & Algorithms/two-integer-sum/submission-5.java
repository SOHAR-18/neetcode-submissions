class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> A = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int diff = target - nums[i];
        if(A.containsKey(diff)){
            return new int[]{A.get(diff), i};
        }
        A.put(nums[i], i);
    }
    return new int[0];
    }
}
