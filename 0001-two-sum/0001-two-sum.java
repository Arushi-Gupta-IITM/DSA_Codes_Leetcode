class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        for(int i=0; i<n-1; i++) {
            int tar = target - nums[i];
            for(int j = i+1; j<n; j++) {
                if(nums[j] == tar) {
                    ans[0] = i;
                    ans[1] = j; 
                }
            }
        }

        return ans;
    }
}