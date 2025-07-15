class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int countNeg = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            int curr = nums[i];
            if(curr < 0) countNeg++;
            max = Math.max(max, curr);
        }

        if(countNeg == n) return max;

        //Kadane's algorithm

        int sum = 0;
        int maxSum = 0;

        for(int i=0; i<n; i++) {
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
            if(sum < 0) {                
                sum = 0;
            }
        }

        return maxSum;
    }
}