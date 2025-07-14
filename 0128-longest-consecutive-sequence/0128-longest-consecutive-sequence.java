class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        
        TreeSet<Integer> set = new TreeSet<>();       
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            set.add(nums[i]);
            min = Math.min(min, nums[i]);
        }

        int count = 0;
        int maxCount = 1;

        for(Integer el : set) {
            if(el == min) {
                count++;
                min++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 1;
                min = el+1;
            }
        }

        maxCount = Math.max(count, maxCount);

        return maxCount;
    }
}