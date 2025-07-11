class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int freq = 0;

        for(int i=0; i<n; i++) {
            if(freq == 0) {
                ans = nums[i];
            }

            if(ans == nums[i]) freq++;
            else freq--;
        }

        freq = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == ans) freq++;
        }

        if(freq > n/2) return ans;
        else return -1;
    }
}